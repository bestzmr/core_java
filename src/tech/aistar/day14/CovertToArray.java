package tech.aistar.day14;

import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 9:50
 */
public class CovertToArray {
    public static String[] convertToStringArray(List<String> s) {
//        Collections.sort(s);//第一种排序方法
        s.sort((s1, s2) -> s1.compareTo(s2));//简洁版
        String[] strings = new String[s.size()];
        return s.toArray(strings);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            strings.add(str);
        }
        System.out.println(Arrays.toString(convertToStringArray(strings)));;

    }
}
