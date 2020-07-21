package tech.aistar.day04;

import java.util.Scanner;

/**
 * 本类用来演示:笔试题
 *
 * @author: success
 * @date: 2020/7/21 4:34 下午
 */
public class ScannerExecise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        ===a===
        10
        a:10
        ====c===
        c:
        ====b====
        3.14
        b:3.14


         */

        System.out.println("===a===");
        int a = sc.nextInt();
        System.out.println("a:"+a);

        System.out.println("====c===");
        String c = sc.nextLine();//失效...
        System.out.println("c:"+c);

        System.out.println("====b====");
        double b = sc.nextDouble();//不会失效
        System.out.println("b:"+b);

    }
}
