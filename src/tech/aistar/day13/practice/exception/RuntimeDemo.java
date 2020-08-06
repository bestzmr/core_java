package tech.aistar.day13.practice.exception;

/**
 * @author: Merlin
 * @time: 2020/8/6 21:03
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("ma 呀！ArithmeticException");
        }
        System.out.println("=====end=======");
    }

}
