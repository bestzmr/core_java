package tech.aistar.day14.maphomework;

import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 19:38
 */
public class DepartSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            map.put(scanner.nextLine(), scanner.nextLine());
        }
        String searchKeyWord = scanner.nextLine();
        List<String> list = obtainDesination(map, searchKeyWord);
        list.stream().forEach(x -> System.out.println(x));
    }

    public static List<String> obtainDesination(Map<String, String> map, String keyWord) {
        List<String> list = new ArrayList<>();
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> m : set) {
            if (m.getValue().equals(keyWord)) {
                list.add(m.getKey());
            }
        }
        return list;
    }
}
