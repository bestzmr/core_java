package tech.aistar.day14.maphomework;

import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 19:21
 */
public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {

            map.put(scanner.nextInt(), scanner.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> m : set) {
            list.add(m.getValue());
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        int result = list.get(0) + list.get(1) + list.get(2);
        System.out.println(result);
    }
}
