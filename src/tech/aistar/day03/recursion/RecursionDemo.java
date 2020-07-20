package tech.aistar.day03.recursion;

/**
 * 本类用来演示:递归算法
 *
 * @author: success
 * @date: 2020/7/20 10:37 上午
 */
public class RecursionDemo {
    public static void main(String[] args) {
        //add();

//        int result = fei(10);
//        System.out.println(result);

        System.out.println(fei(5));

        System.out.println(common(12,20));
    }

    //如果没有指定递归的出口,那么会抛出java.lang.StackOverflowError堆栈溢出错误.
//    public static void add(){
//        add();
//    }

    /**
     * 文档注释 - 解释类和方法的.
     * @param n 斐波那契数的位置
     * @return 第n个位置上对应的斐波那契数的值
     */
    public static int fei(int n){
        //1.指明递归的出口
        if(n==1 || n==2){
            return 1;
        }
        //2. 方法中调用自己
        return fei(n-1) + fei(n-2);

        //fei(5) = fei(4) +          fei(3)
        //         fei(3) +      fei(2) + fei(2) + fei(1)
        //         fei(2) + fei(1) + fei(2) + fei(2) + fei(1)
        //         = 5
    }

    /**
     * 求出m,n的最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int common(int m,int n){
        //1. 递归出口
        if(m % n == 0){
            return n;
        }
        return common(n,m % n);

        //common(8,4)
    }
}
