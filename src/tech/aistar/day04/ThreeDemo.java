package tech.aistar.day04;

/**
 * 本类用来演示:三元运算符
 *
 * @author: success
 * @date: 2020/7/20 3:50 下午
 */
public class ThreeDemo {
    public static void main(String[] args) {
        int age = 20;
        int result = age>18?100:200;
        System.out.println(result);//100

        boolean flag = true;

        int result2 = flag?(age>18?500:700):1000;
        System.out.println(result2);//500
    }
}
