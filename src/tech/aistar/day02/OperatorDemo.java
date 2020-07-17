package tech.aistar.day02;

/**
 * 本类用来演示:运算符
 *
 * @author: success
 * @date: 2020/7/17 3:06 下午
 */
public class OperatorDemo {
    public static void main(String[] args) {
        int year = 2091;

        System.out.println("千:"+year/1000%10);
        System.out.println("百:"+year/100%10);
        System.out.println("十:"+year/10%10);
        System.out.println("个:"+year%10);

        System.out.println(10+20);//30

        //前++
        //总结:变量本身和表达式都会自增1

        //++符号在变量的左边
        int i = 1;
        //++i;
        int result = ++i;

        System.out.println(i);//2
        System.out.println("result:"+result);//2

        //后++
        //总结:变量本身会自增1,
        //int x = m++; // 将变量m自增之前的值赋值给了x[表达式]

        //++符号在变量的右边
        int m = 2;
        int x = m++;
        System.out.println("m:"+m);//3
        System.out.println("x:"+x);//2

        //练习
        int t1 = 1;
        int t2 = t1++ + ++t1 + --t1;
        t2 = t2-- + ++t1 + ++t2;
        System.out.println("t2:"+t2);








    }
}
