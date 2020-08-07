package tech.aistar.day14.maphomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Merlin
 * @time: 2020/8/7 18:31
 */
public class ReturnStudent {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            map.put(scanner.nextInt(), scanner.nextInt());
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        int max = 0;
        int maxYear = 0;
        for (Map.Entry<Integer, Integer> set : entrySet) {
            if (max < set.getValue()) {
                max = set.getValue();
                maxYear = set.getKey();
            }
        }
        System.out.println(maxYear);
    }
}
