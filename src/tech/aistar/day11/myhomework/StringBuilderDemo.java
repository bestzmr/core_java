package tech.aistar.day11.myhomework;

import org.junit.Test;

/**
 * @author: Merlin
 * @time: 2020/8/3 18:06
 */
public class StringBuilderDemo {
    private StringBuilder stringBuilder = new StringBuilder();

    private StringBuilder stringBuilder2 = new StringBuilder();

    @Test
    public void stringBuilderDemo() {
        stringBuilder.append("abc")
                .append("-")
                .append("def");

        System.out.println(stringBuilder.toString());

        stringBuilder.append(12);
        System.out.println("int:" + stringBuilder.toString());

        stringBuilder.append(123.34d);
        System.out.println("double:" + stringBuilder.toString());

        stringBuilder.append(123.3f);
        System.out.println("float:" + stringBuilder.toString());

        stringBuilder.append(true);
        System.out.println("boolean:" + stringBuilder.toString());

        stringBuilder.append(1232l);
        System.out.println("long:" + stringBuilder.toString());

        stringBuilder2.append("qwer");
        stringBuilder.append(stringBuilder2);
        System.out.println("stringbuilder:" + stringBuilder.toString());

        System.out.println("capacity:" + stringBuilder.capacity());

        System.out.println("charAt:" + stringBuilder.charAt(2));

        System.out.println("indexOf:" + stringBuilder.indexOf("def"));

        stringBuilder.insert(3, true);
        System.out.println("insert->boolean:" + stringBuilder.toString());

        stringBuilder.insert(3, 123.544d);
        System.out.println("insert->double:" + stringBuilder.toString());

        stringBuilder.insert(3, 234.3f);
        System.out.println("insert->float:" + stringBuilder.toString());

        stringBuilder.insert(3, 234l);
        System.out.println("insert->long:" + stringBuilder.toString());

        stringBuilder.insert(3, "merlin");
        System.out.println("insert->String:" + stringBuilder.toString());

        System.out.println("length:" + stringBuilder.length());

        stringBuilder.replace(2, 5, "zzzzz");
        System.out.println("replace"+stringBuilder.toString());

        System.out.println("reverse"+stringBuilder.reverse().toString());

        System.out.println("subquence:" + stringBuilder.subSequence(3, 7));

        System.out.println("subString:" + stringBuilder.substring(5, 7));

    }
}
