package tech.aistar.day04.homework02;

/**
 * 本类用来演示:十进制转换成二进制[精简的]
 *
 * @author: success
 * @date: 2020/7/22 8:49 上午
 */
public class BinaryDemo {
    public static void main(String[] args) {
        //java.lang.Integer - [int类型对应包装类型]
        //static String toBinaryString(int n);//jdk内置的十进制转二进制
        //String binary = Integer.toBinaryString(10);
       // System.out.println(binary);

//        String binary = toBinary(10);
//        System.out.println(binary);

        System.out.println(toBinaryString(14));
    }

    /**
     * 十进制转二进制
     * 比如:10 -> 1010
     * @param n
     * @return
     */
    public static String toBinary(int n){
        //定义一个字符串,用来拼接倒过来的余数[二进制]
        String str = "";

        //思路:一个十进制的数不断除以2,直到商是0为止,然后倒过来取余数
        //典型的应用:当你不知道循环的次数,但是知道循环退出的条件 - while循环
        while(true){
            //1. 得到商
            int s = n / 2;
            //2. 得到余数
            int y = n % 2;

            //拼接 - 先出来的,放入字符串的末尾
            str = y + str;

            //3. 循环退出
            if(s == 0)
                break;

            n = s;
        }

        return str;
    }

    /**
     * 十进制 -> 二进制
     * @param n
     * @return
     */
    public static int toBinaryString(int n){


        //思路 - 0 1 0 1

        // 0*10的0次方 = 0
        //1*10的1次方 = 10
        //0*10的2次方 = 0
        //1*10的3次方 = 1000

        //相加 = 1 0 1 0

        //定义一个指数的计数器
        int pos = 0;

        int binary = 0;//存储最终计算的二进制的数值

        while(true){
            //1. 得到商
            int s = n / 2;
            //2. 得到余数
            int y = n % 2;

            //TODO.. 待完成的功能....
            binary+= y*Math.pow(10,pos++);

            //3. 循环退出
            if(s == 0)
                break;

            n = s;
        }


        return binary;
    }
}
