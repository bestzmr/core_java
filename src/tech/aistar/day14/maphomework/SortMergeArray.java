package tech.aistar.day14.maphomework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author: Merlin
 * @time: 2020/8/7 18:16
 */
public class SortMergeArray {
    public static List<Integer> sortMergeArrayList(List<Integer> list) {
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        List<Integer> result = new ArrayList<>();
        result.add(list.get(2));
        result.add(list.get(6));
        result.add(list.get(8));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }
        list1.addAll(list2);
        List<Integer> result = sortMergeArrayList(list1);
        result.stream().forEach(x -> System.out.println(x));
    }
}
