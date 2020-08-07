package tech.aistar.day14.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/7 16:42
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        covertToStringArray(list);
    }

    private static void covertToStringArray(List<String> list) {
        List<String> tempList = new ArrayList<>();
        tempList.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < tempList.size(); j++) {

                if (list.get(i).compareTo(tempList.get(j)) > 0) {
                    if (j == tempList.size() - 1) {
                        tempList.add(list.get(i));
                        break;
                    }

                } else {
                    tempList.add(j, list.get(i));
                    break;
                }
            }
        }
        for (String s : tempList) {
            System.out.println(s);
        }
    }
}
