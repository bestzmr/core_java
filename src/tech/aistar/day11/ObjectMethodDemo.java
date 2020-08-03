package tech.aistar.day11;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 2:46 下午
 */
public class ObjectMethodDemo {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false

        System.out.println(s1.equals(s2));//true

        System.out.println("====");

        Book b1 = new Book(1,"1002","java");
        Book b2 = new Book(1,"1002","python");
        System.out.println(b1 == b2);//false

        System.out.println(b1.equals(b2));//true
    }
}
