package tech.aistar.day14.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Merlin
 * @time: 2020/8/7 16:52
 */
public class SetPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        int countOne = scanner.nextInt();
        for (int i = 0; i < countOne; i++) {
            set1.add(scanner.nextInt());
        }
        int countTwo = scanner.nextInt();
        for (int i = 0; i < countTwo; i++) {
            set2.add(scanner.nextInt());
        }
        Set<Integer> set3 = new HashSet<>();

        for (Integer value : set1
        ) {
            if (set2.add(value)) {
                set3.add(value);
            }
        }
        for (Integer value : set2) {
            if (set1.add(value)) {
                set3.add(value);
            }
        }
        Iterator<Integer> integerIterator = set3.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());

        }
    }
}
