package tech.aistar.day11.myhomework;

import org.junit.Test;
import tech.aistar.day08.test02.dp.version01.Person;

import java.util.Arrays;

/**
 * @author: Merlin
 * @time: 2020/8/3 16:49
 */
public class StringDemo {
    private final static String str = "jkabca addfff";
    private final static String str2 = "abcdefghigk";
    private final static String str3 = " 234 ";
    private final static boolean bool = true;
    private final static int number = 213;
    private final static long long_ = 134l;
    private final static double double_ = 123.23d;
    private final static Person person_ = new Person();

    @Test
    public void stringTest() {
        char ch = str.charAt(1);
        System.out.println("charAt():" + ch);

        int i4 = str.compareTo(str2);
        System.out.println("compare:" + i4);

        int i5 = str.compareToIgnoreCase(str2);
        System.out.println("compareToIgnoreCase:" + i5);

        String merge = str.concat(str2);
        System.out.println("merge:" + merge);

        System.out.println("contains:" + str2.contains("bcde"));

        System.out.println("endswith:" + str2.endsWith("fff"));

        System.out.println("equals:" + str2.equals(str));

        System.out.println("equalsIgnoeCase:" + str.equalsIgnoreCase(str2));

        System.out.println("empty:" + str.isEmpty());

        System.out.println("intern:" + str.intern());

        System.out.println("lastIndexOf(int ch)"+str.indexOf(2));

        System.out.println("lastIndexOf(String str)" + str.indexOf("fff"));

        System.out.println("length:" + str.length());

        System.out.println("replace:" + str.replace('f', 'x'));

        System.out.println("spilt:" + Arrays.toString(str.split(" ")));

        System.out.println("startWith:" + str.startsWith("abc"));

        System.out.println("Substring:" + str.substring(2, 5));

        System.out.println("toLowerCase:" + str.toLowerCase());

        System.out.println("toString:" + str.toString());

        System.out.println("toUpperCase:" + str.toUpperCase());

        System.out.println("trim:" + str3.trim());

        System.out.println("valueOf->boolean:" + String.valueOf(bool));

        System.out.println("valueOf->int:" + String.valueOf(number));

        System.out.println("valueOf->long:" + String.valueOf(long_));

        System.out.println("valueOf->double:" + String.valueOf(double_));

        System.out.println("valueOf->Person:" + String.valueOf(person_));

    }

}
class person{
    private String name;
    private  String sex;
    private int age;

    public person(String name) {
        this.name = name;
    }

    public person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}