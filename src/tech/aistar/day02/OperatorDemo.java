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

        //变量    t1  2    3   2

        //表达式      1    3    2 =

        int t2 = t1++ + ++t1 + --t1;//t2 = 6

        //变量    t2(5)  t1()
        //表达式   6      3    6 = 15
        t2 = t2-- + ++t1 + ++t2;
        System.out.println("t2:"+t2);//15

        //尽量不要使用
        //拓展的 ++ -- 底层会进行窄化操作[强制类型转换]
        byte b = 127;

        //java中的数据都是带有符号的数据
        //最高为是符号位 0-正数,1-负数
        //b = (byte) (b + 1);

        ++b;//编译是ok的,底层->b = (byte) (b + 1);

        System.out.println(b);// -128

        char c = 'a';
        c++;//c = (char)(c + 1);
        System.out.println(c);//b

        double pi = 3.14;
        pi++;//pi = pi + 1;
        System.out.println(pi);//4.140000000000001


        int a = 1;
        int ts = a+=2;//a = a + 2;
        System.out.println("a:"+a);
        System.out.println("ts:"+ts);//3 +=  优先级 高于 =

        // += 也是要慎用的. - 底层也是会进行窄化操作的
        short s1 = 1;
        //s1 = (short) (s1 + 1);
        s1+=1;//ok - s1 = (short) (s1 + 1);
        System.out.println("s1:"+s1);

        System.out.println("===比较运算符==");
        System.out.println(10 == 10);//true

        //基本数据类型,== 就是比较变量中保存的数据.

        System.out.println(2 > 1);//true

        System.out.println("====华丽丽的分割线====");
        //逻辑与
        //变量或者字面量以及比较运算符组成的合法的语句 - 条件表达式
        System.out.println(1>0 && 2>1);//true

        boolean flag  = true;
        System.out.println(flag && true);//ok

        //证明逻辑与的短路的特性.
        int b1 = 1;
        System.out.println(false && (b1++)>0);
        System.out.println("b1:"+b1);//1

        //按位与 - 非短路与
        int b2 = 1;
        System.out.println(false & (b2++)>0);
        System.out.println("b2:"+b2);//2

        System.out.println(10 & 8);//8

        System.out.println(10 | 8);//10
    }
}
