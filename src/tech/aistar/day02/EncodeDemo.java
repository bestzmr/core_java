package tech.aistar.day02;

/**
 * 本类用来演示:内码和外码
 *
 * java底层的内码unicode统一使用2个字节处理.
 *
 * 大概YY下乱码产生的过程:
 *
 * UTF-8 - x1 x2 x3    y1 y2 y3  u1 u2 u3
 *
 * GBK-> x1x2 x3y1 y2y3 u1u2 u3
 *
 * 未来外码都是utf-8...
 *
 * @author: success
 * @date: 2020/7/17 1:35 下午
 */
public class EncodeDemo {
    public static void main(String[] args) {
        String name = "管成功a9";

        //获取字符串的字节数组
        byte[] buf = name.getBytes();

        //.java以及.class文件的编码都是utf-8,一个汉字占3个字节,一个数字,一个字母,一个符号占1个字节.

        //gbk.一个汉字占2个字节,数字,字母,符号仍然是占1个字节
        System.out.println(buf.length);
    }
}
