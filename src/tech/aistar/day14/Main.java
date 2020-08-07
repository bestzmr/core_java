package tech.aistar.day14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
        convertToStringArray(list);
    }

    public static void convertToStringArray(List<String> list){
        // 临时集合，用于存放排序后的数据
        List<String> tempList = new ArrayList<>();
        // 将原集合中的第一个元素数据设置里面去
        tempList.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            for(int j = 0; j < tempList.size(); j++){
                if(list.get(i).compareTo(tempList.get(j)) > 0){
                    if(j == tempList.size() -1){
                        tempList.add(list.get(i));
                        break;
                    }
                } else {
                    tempList.add(j,list.get(i));
                    break;
                }
            }
        }
        for(String s:tempList){
            System.out.println(s);
        }

    }



    /**
     *
     * @param list
     */
//    public static void convertToStringArray(List<String> list){
//        // Comparator  比较器
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // o1与o2相等返回0   o1>o2  返回>0  o1<o2  返回小于0
//                // 定制排序  o1在前表示升序     o2在前表示降序
//                return o2.compareTo(o1);
//            }
//        });
//
//        for(String s:list){
//            System.out.println(s);
//        }
//    }
}
