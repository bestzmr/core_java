package tech.aistar.day14.maphomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Merlin
 * @time: 2020/8/7 17:56
 */
public class FruitSelector {
    public static void fruitSelector(List<String> list1,List<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).endsWith("a") || list1.get(i).endsWith("e")) {
                list1.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).startsWith("m") || list2.get(i).startsWith("a")) {
                list2.remove(i);
                i--;
            }
        }
        list1.addAll(list2);
        if (list1.size() == 0) {
            System.out.println("No Fruit Found");
        } else {
            String[] strings = new String[list1.size()];
            list1.toArray(strings);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list1.add(scanner.nextLine());
        }
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num2; i++) {
            System.out.println("-----");
            list2.add(scanner.nextLine());
        }
        fruitSelector(list1, list2);
    }
}
