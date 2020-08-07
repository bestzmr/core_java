package tech.aistar.day14.maphomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Merlin
 * @time: 2020/8/7 18:24
 */
public class DeleteArrayLength {
    public static String[] deleteArray(List<String> list, int subLength) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 2) {
                list.remove(i);
                i--;
            }
        }
        String[] strings = new String[list.size()];
        list.toArray(strings);
        return strings;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(scanner.nextLine());
        }
        int subLength = scanner.nextInt();
        String[] strings = deleteArray(list, subLength);
        System.out.println(strings.length);

    }
}
