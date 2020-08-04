package tech.aistar.day11;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Date;

/**
 * 本类用来演示:字符串中常用的方法
 *
 * @author: success
 * @date: 2020/8/4 2:23 下午
 */
public class StringAPiDemo {
    public static void main(String[] args) {
        //构造
        String s1 = new String();// ""空字符串
        String s2 = null;//null

        //把字符串转换成byte[]
       // byte[] bytes = "good".getBytes();
        byte[] bytes = new byte[0];
        try {
            //utf-8编码下,一个汉字占3个字节,字母数字符号仅占一个字节
            //gbk编码下,一个汉字占2个字节,字母数字符号仅占一个字节
            bytes = "孙子abc".getBytes("gbk");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //加密操作
        for (int i = 0; i < bytes.length; i++) {
            //bytes[i]^=888;
            System.out.println(bytes[i]);
        }

        ////利用字节数组来构建一个字符串对象
        //String(byte[] byte);
        String byteStr = new String(bytes);
        System.out.println(byteStr);


        //1. format方法
        System.out.println(String.format("%tF",new Date()));//2020-08-04
        System.out.println(String.format("%tT",new Date()));//14:26:41

        //2.获取字符串长度
        System.out.println("abd".length());

        //3.判断字符串是否为空,判断字符串的长度是否为0
        System.out.println(" ".isEmpty());//false

        //4. 根据下标获取字符串中的指定字符,返回char类型
        //字符串的下标也是范围的[0,字符串长度-1]
        //如果不在这个范围,java.lang.StringIndexOutOfBoundsException字符串下标越界异常
        System.out.println("abc".charAt(2));

        //5. 字符串的比较
        System.out.println("abc".equals("abc"));//true

        //6. 忽略大小写的比较
        System.out.println("abc".equalsIgnoreCase("ABC"));//true

        //int compareTo
        System.out.println("a".compareTo("b"));//-1 负数
        System.out.println("b".compareTo("a"));//1 正数
        System.out.println("a".compareTo("a"));//0 零

        //6. 判断前缀
        System.out.println("JavaScript".startsWith("Java"));//true

        //7. 判断后缀.
        System.out.println("xx.gif".endsWith(".gif"));//筛选文件的.

        //8. 找出指定的字符串在原来的字符串中第一次出现的下标的位置
        System.out.println("abcbc".indexOf('b'));//1

        //从下标2开始继续寻找以后第一次出现'b'字符的下标
        System.out.println("abcbc".indexOf('b',2));//3

        //9. lastIndexOf

        //10. 截取
        String s5 = "hello world";
        String result = s5.substring(0);

        System.out.println(s5 == result);//true

        System.out.println("result:"+result);//ello world
        System.out.println("s5:"+s5);//hello world

        //[1,3) - 下标
        String result2 = s5.substring(1,3);
        System.out.println(result2);//el

        System.out.println("el" == result2);//false

        //11. 在字符串的末尾进行拼接
        String s7 = "abc";
        String s8 = s7.concat("de");//没有让s7重新指向新的扩容之后的char[]

        System.out.println(s8);

        //YY -> 如果调用一个方法之后,有返回类型,几乎就没有对原来对象进行改变
        //      如果没有返回类型,大致是对原来的对象进行改变了.

        System.out.println("abcde" == s8);//false

        //replace替换
        //I Love java
        System.out.println("I Love Girl".replace("Girl","java"));

        //
        System.out.println("I Love Girl".replace("ov",""));

        //boolean match(String s);
        //正则表达式
        String username = "23";
        if(username.matches("[0-9]+")){
            System.out.println("匹配成功!");
        }else{
            System.out.println("匹配失败!");
        }

        //判断是否包含
        System.out.println("good".contains("oo"));//true

        //切割
        String ips = "192.168.1.61";
        //根据.进行切割,  .在正则表达式中具有特殊的意义 - 代替任何字符的.
        //对.进行转义

        String[] arr = ips.split("\\.");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("======");
        String letters = "I123L34o434v09eY22o222u";
        //根据数字进行切割
        String[] letts = letters.split("[0-9]+");
        for (String lett : letts) {
            System.out.print(lett);
        }

        System.out.println("abc".toUpperCase());
        System.out.println("BC".toLowerCase());



    }
}
