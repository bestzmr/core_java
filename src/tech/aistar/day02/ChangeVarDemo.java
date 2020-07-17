package tech.aistar.day02;

/**
 * 本类用来演示:交换来个变量的值
 *
 * @author: success
 * @date: 2020/7/17 4:23 下午
 */
public class ChangeVarDemo {
    public static void main(String[] args) {
        //1. 搓的版本
        // 使用中间变量
        int a = 10;
        int b = 20;

        //程序
        int temp = a;

        a = b;

        b = temp;

        System.out.println("a:"+a);//20
        System.out.println("b:"+b);//10

        //升华 - 异或的特性
        //一个数连续异或同一个数俩次,结果是它本身
        int m = 100;
        int n = 200;

        m = m ^ n;// m = 100^200
        n = m ^ n;//n = 100^200^200 = 100
        m = m ^ n;//m = 100^200^100 = 200

        System.out.println("m:"+m);//200
        System.out.println("n:"+n);//100


        //success自创版本...
        int x = 500;
        int y = 600;
        //y = 500^600^600 = 500
        y = x^(x=y)^y;
        System.out.println("x:"+x);//600
        System.out.println("y:"+y);//500

    }
}
