package tech.aistar.day14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Merlin
 * @time: 2020/8/7 13:47
 */
public class SetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            set1.add(num);
            set3.add(num);
        }
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        set3.retainAll(set2);//第二种
        set1.addAll(set2);
        for (Integer integer : set1) {
            if (!set3.contains(integer)) {
                System.out.println(integer);

            }
        }
//        for (Integer integer : set1) {//第一种
//            if (!set2.contains(integer)) {
//                System.out.println(integer);
//            }
//        }
//        for (Integer integer : set2) {
//            if (!set1.contains(integer)) {
//                System.out.println(integer);
//            }
//        }
    }
}
