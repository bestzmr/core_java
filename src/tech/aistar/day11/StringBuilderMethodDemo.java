package tech.aistar.day11;

/**
 * 本类用来演示:线程不安全,效率高于StringBuffer的
 *
 * @author: success
 * @date: 2020/8/4 3:43 下午
 */
public class StringBuilderMethodDemo {
    public static void main(String[] args) {
        //1. 字符串类型String类StringBuilder类型之间的相互转换
        //String->StringBuilder

        String s1 = "good";

        //默认的容量是16
        StringBuilder builder = new StringBuilder(s1);
        System.out.println(builder);

        StringBuffer b2 = new StringBuffer();
        //可变的字符串
        b2.append("abc");

        System.out.println(builder.length());//有效长度7
        System.out.println(builder.capacity());//容量20

        //根据指定下标进行删除操作
        StringBuilder b3 = new StringBuilder("abcde");
        //System.out.println(b3.delete(1,3));//ade   [1,3)

        //System.out.println(b3);// ade

        //System.out.println(b3.deleteCharAt(1));//acde
        //System.out.println(b3);

        //插入...
        System.out.println(b3.insert(0,"ooo"));//oooabcde
        System.out.println(b3);

        //反转字符串...
        System.out.println(b3.reverse());//edcbaooo

        //StringBuilder -> String
        System.out.println(b3.toString());

        //StringBuilder -> String
        String result =String.valueOf(b3);
        System.out.println(result);

    }
}
