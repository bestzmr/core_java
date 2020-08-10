package tech.aistar.snake;

import java.util.HashSet;
import java.util.LinkedList;
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
        }
    }

    //4. 定义一个蛇的类 - 内部类
    public class Snake{
        //蛇吃食物 - 身体长一个
        //不吃食物 - 身体是没长

        //定义哪些属性呢...
        //需要一个集合来存储蛇身的所有的坐标.
        LinkedList<Node> nodes = new LinkedList<>();

        //构造 - 蛇神的初始化工作.
        public Snake(){
            //向集合中添加初始的坐标点...
        }
    }

}
