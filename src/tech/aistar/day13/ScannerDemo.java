package tech.aistar.day13;

import java.util.Scanner;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 4:17 下午
 */
public class ScannerDemo {
    public static void main(String[] args) {
        int result01 = getNum();
        System.out.println(result01);

        int result02 = getNum();
        System.out.println(result02);//java.util.NoSuchElementException
    }

//    public static int getNum(){
//        //昂贵的资源在使用完毕之后,都是要关闭的.
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        sc.close();
//        return n;
//    }

    /**
     * jdk7.0提供的语法糖
     * try(申请的资源) - 自动在使用完毕之后释放!!!!
     * @return
     */
    public static int getNum(){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            return n;
        }
    }
}
