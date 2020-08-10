package tech.aistar.day14.practice;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author: Merlin
 * @time: 2020/8/10 16:55
 */
public class BracketDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入括号：>");
        String line = scanner.nextLine();

        if (match(line)) {
            System.out.println("匹配");
        } else {
            System.out.println("不匹配");
        }
    }
    public static boolean match(String bracket) {
        char[] arr = bracket.toCharArray();
        LinkedList<Character> list = new LinkedList<>();

        list.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            Character c = arr[i];
            Character top = null;
            if (list.isEmpty()) {
                list.push(c);
                continue;

            } else {
                top = list.getFirst();
            }

            if (top.equals('(') && c.equals(')') || top.equals('[') && c.equals(']') || top.equals('{') && c.equals('}')) {
                list.pop();
            } else {
                list.push(c);
            }
        }
        return list.isEmpty();
    }
}
