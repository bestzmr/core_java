package tech.aistar.day04;

/**
 * 本类用来演示:do..while - 前置循环的意思
 *
 * @author: success
 * @date: 2020/7/21 3:26 下午
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int age = 19;

        do{
            //优先先进入到循环体中执行一次,然后再进行条件的判断
            //如果成立,则继续循环,否则退出
            System.out.println("while...");
        }while(age<=18);
    }
}
