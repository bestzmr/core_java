package tech.aistar.day14.maphomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Merlin
 * @time: 2020/8/7 20:04
 */
public class StateCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            map.put(scanner.nextLine(), scanner.nextLine());
        }

        String keyWord = scanner.nextLine();
        getCapital(map, keyWord);
    }

    private static void getCapital(Map<String, String> map, String keyWord) {
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> m : set) {
            if (m.getKey().equals(keyWord)) {
                System.out.println(m.getValue().toLowerCase()+"$"+m.getKey().toLowerCase());
            }
        }
    }
}
