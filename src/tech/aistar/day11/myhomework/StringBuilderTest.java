package tech.aistar.day11.myhomework;

import org.junit.Test;

/**
 * @author: Merlin
 * @time: 2020/8/4 16:36
 */
public class StringBuilderTest {
    StringBuilder builder = new StringBuilder();
    {
        builder.append("This is a log file,it was store at")
                .append("\"d:\\Program File\\temp\" ")
                .append("directory.the format of log file was:\n")
                .append("20130509:Jack:M:1990-08-08");
    }
    @Test
    public void stringBuilderTest(){
        /**
         * 1.截取此内容中的路径子字符串
         *   打印出的结果为(找出包裹路径的双引号的下标,substring)
         *   d:\Program File\temp
          */
        System.out.println(builder.toString());
        int startIndex = builder.indexOf("\"");
        int endIndex = builder.indexOf("\"", startIndex+1);

        String result = builder.substring(startIndex+1, endIndex);
        System.out.println("第一问：:" + result);
//        System.out.println("startIndex" + startIndex);
//        System.out.println("endIndex" + endIndex);


        /**
         * 2.把第一个引号之前的部分中的所有空格替换为#
         *   把第二个引号之后的部分中的所有空格替换为*
         */
        String string1 = builder.substring(0, startIndex);
        String str = builder.substring(startIndex, endIndex + 1);
        String string2 = builder.substring(endIndex + 1);
        string1 = string1.replace(" ", "#");
        string2 = string2.replace(" ", "*");
        builder = new StringBuilder(string1 +str+ string2);
        System.out.println("第二问："+builder.toString());


        /**
         * 3.把\n后面的字符串取出打印
         */
        String str4 = builder.toString().split("\n")[1];
        System.out.println("第三问："+str4);


        /**
         * 4.以:作为切割符,把\n后面截取出来的字符串分段打印
         *   20130509
         *   Jack
         *   M
         *   1990-08-08
         */

        String[] strings = str4.split(":");
        System.out.println("第四问：");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

}
