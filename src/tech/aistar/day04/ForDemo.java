package tech.aistar.day04;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/20 4:16 下午
 */
public class ForDemo {
    public static void main(String[] args) {
        // 'a'->'z'
        for (char c = 'a';c<='z';c++){
            System.out.print(c);
        }
        System.out.println();//换行...
        // 'Z' - 'A'

        for(int i=90;i>=65;i--){
            System.out.print((char)i);
        }
        System.out.println();

        //不推荐大家写的语法...
        int i;
        for (i=1;i<=5;) {//表达式是可以省略不写.
            System.out.println(i);
            i++;
        }

        //死循环语句内部肯定是要有打破死循环的语句的.
//        for(;;){
//            System.out.println("我是一个死循环");
//        }

//        System.out.println();

        //优化. - 给钱
        //for (long j = 0; j < 999999999999999999L; j++);//省略循环体

        System.out.println("for...");
    }
}
