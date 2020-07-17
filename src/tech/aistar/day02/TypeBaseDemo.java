package tech.aistar.day02;

/**
 * 本类用来演示:基本数类型的使用和定义
 *
 * @author: success
 * @date: 2020/7/17 9:02 上午
 */
public class TypeBaseDemo {
    public static void main(String[] args) {
        //定义一个int类型的变量 - java中的变量是有数据类型的.
        //并且给定义一个初始值为10 - 赋值


        //代码的背后是什么?
        //当启动程序的时候,就是启动JVM这个进程[qq,微信,idea].
        //jvm就会调用main方法 - 进入到main的方法体中去执行里面的代码

        //埋个种子
        //当遇到int i的时候,就会立即在jvm的内存[栈区]中开辟一块区域
        //这个区域的大小是int类型的占的字节[4个字节=32bit]

        // = 是一个赋值运算符,把字面量10放到这块int类型大小的区域中.

        // 因为内存中的每块区域都是拥有一个内存地址的 - 对于用户是不可见的.
        // jvm就为这个内存区域取了一个别名 - i - 变量名

        //实际上底层<变量名,内存地址>
        // i 0x19ad
        // a 0x9882
        int i = 10;

        //在同一个{}中,是不允许出现同名的变量.
        //int i = 20;//error

        //使用变量i - 打印变量i
        System.out.println(i);

        byte b = 127;

        short s = 100;

        //关于int类型可以存储的值
        //java中int类型默认表示的数字是十进制的数据

        //3*8^1 + 2*8^0 = 26
        int a = 032;//java中是使用0开头的数字表示八进制的数据.
        System.out.println("a:"+a);

        //java中是使用0x开头的数字表示十六进制的数据

        //11*16^1+1*16^0 = 177
        int a01 = 0x00b1;
        System.out.println("a01:"+a01);//177

        //表示char类型 - 单个字符
        //java中是使用单引号来表示char类型的.
        int c1 = '0'+1;//char类型在参加运算的时候,会先转换成ascill码后,然后再参与运算

        //'a'对应的ascill码的数值是97
        //'A' -> 65
        // '0' -> 48
        System.out.println("c1:"+c1);//97

        //long - 长整型 - 8个字节 - 64bit
        long o1 = 123;//ok

        //提高数字的可读性
        long o2 = 1_234_567;//jdk7.x以后才拥有的语法
        System.out.println("o2:"+o2);

        //定义一个float - 单精度浮点数(第8位)
        float f = 3.14f;//why?????
        System.out.println("f:"+f);

        //java中的小数在计算的时候会有精度的丢失
        float f2 = 0.34567846f;
        System.out.println("f2:"+f2);//0.34567845

        int n = 123456789;
        float ft = n;
        System.out.println("ft:"+ft);//1.23456792E8

        System.out.println(0.1 + 0.2);//0.30000000000000004


    }
}
