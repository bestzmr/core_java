package tech.aistar.snake;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

/**
 * 本类用来演示: 贪吃蛇算法 - 体验LinkedList的使用场景
 *
 * @author: success
 * @date: 2020/8/10 2:43 下午
 */
public class SnakeGame {
    //需要做哪些事情
    //1. 游戏的边框确定 - 打印矩形墙.
    public static final int ROWS = 20;//行.
    public static final int COLS = 20;//列.

    //需要一个集合来存储食物的坐标(Node对象)
    Set<Node> foods = new HashSet<>();//项目中,订单信息可以使用Set集合.

    private Snake snake;//维护内部类对象

    public Snake getSnake() {
        return snake;
    }

    //构造方法
    public SnakeGame(){
        //对象与对象之间的关系 - 聚合关系
        //强调的是整体和部分的关系,并且是强耦合的关系
        //整体必须要负责局部的整个生命周期
        //整体出来之后,局部必须出来 - 人和胳膊
        this.snake = new Snake();

        //食物...
        initFoods(3);
    }

    //随机生成食物的方法
    public void initFoods(int n){
        Random r = new Random();
        do{
            //1. 获取x
            //随机的范围 - [1,18]
            //已经能够控制生成的食物绝对不可能出现在墙上...
            int x = r.nextInt(ROWS-2)+1;
            int y = r.nextInt(COLS-2)+1;

            //进一步控制生成的食物不能在蛇的身上
            if(snake.contains(x,y)){
               continue;
            }

            //2. 把x,y封装成Node对象并且添加到foods集合中
            //set集合特性,如果重复则拒绝添加.
            foods.add(new Node(x,y));//提供了equals和hashcode方法.

        }while(foods.size()!=n);
    }

    //2. 确定随机生成的食物的个数位置.
    //  2-1. 食物的位置不允许直接就生成到蛇身上了..
    //  2-2. 食物的位置也不允许直接生成在墙上面.
    //  2-3. 随机生成的一旦重复,必须要重新生成.

    //3. 确定蛇#的位置.
    public void printGames(){
        //定义一个二维数组
        String[][] arr = new String[ROWS][COLS];

        //输出墙...
        //输出食物的位置
        //输出蛇的位置
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                //墙的信息
                if(i == 0 || i == ROWS-1 || j==0 || j == COLS-1){
                    arr[i][j] = "*";
                }else if(snake.contains(i,j)){
                    //i,j对应的坐标就是蛇的身体...
                    arr[i][j] = "#";
                }else if(foods.contains(new Node(i,j))){
                    arr[i][j] = "0";
                }else{
                    arr[i][j] = " ";
                }
                System.out.printf("%2s",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("w->上,s->下,a->左,d->右");
    }

    //4. 定义一个蛇的类 - 内部类
    public class Snake{
        //蛇吃食物 - 身体长一个
        //不吃食物 - 身体是没长

        //定义哪些属性呢...
        //需要一个集合来存储蛇身的所有的坐标.
        LinkedList<Node> nodes = new LinkedList<>();

        //蛇的移动方向 - 技巧的设置
        private int dir;

        //判断蛇是否相反移动... - 技巧
        public static final int UP = -1;
        public static final int DOWN = 1;
        public static final int LEFT = -2;
        public static final int RIGHT= 2;

        //构造 - 蛇神的初始化工作.
        public Snake(){
            //向集合中添加初始的坐标点...
            nodes.add(new Node(5,5));
            nodes.add(new Node(5,6));
            nodes.add(new Node(5,7));
            nodes.add(new Node(5,8));
            nodes.add(new Node(5,9));

            //默认的方向
            dir = LEFT;
        }

        //添加一个方法,用来判断某个坐标是否属于蛇身的坐标
        public boolean contains(int x,int y){
            //必须要equals和hashcode,当且仅当x,y一致的时候,才认为是同一个Node对象.
            return nodes.contains(new Node(x,y));
        }

        //模拟走一步
        public void steps(int dir){
            if(this.dir + dir == 0){
                throw new RuntimeException("sorry,不能相反方向移动!game over!");
            }
            this.dir = dir;
            step();
        }
        //算法逻辑的核心..
        public void step(){
            //获取蛇头
            Node header = nodes.getFirst();

            int x = header.getX() + this.dir % 2;
            int y = header.getY() + this.dir / 2;

            //判断移动的方向.
//            switch (this.dir){
//                case UP:
//                    x--;
//                    break;
//                case DOWN:
//                    x++;
//                    break;
//                case LEFT:
//                    y--;
//                    break;
//                case RIGHT:
//                    y++;
//                    break;
//            }

            //不能撞墙
            if(x == 0 || x == ROWS -1 || y == 0 || y == COLS - 1){
                throw new RuntimeException("sorry,撞墙了!");
            }
            //不能撞到自己
            if(contains(x,y)){
                throw new RuntimeException("sorry,不能撞到自己!");
            }

            //得出一个新的点的坐标
            header = new Node(x,y);

            //先把这个新的坐标放到蛇的身体中
            nodes.addFirst(header);

            System.out.println(nodes);

            //判断是否要删除尾部
            //如果吃到食物 - 不要删除
            //从食物的集合中删除一个元素
            if(foods.remove(header)){//返回true,食物的集合中是包含header - 食物的点坐标
                return;
            }
            //如果没有吃到食物 - 删除
            nodes.removeLast();
        }
    }
}
