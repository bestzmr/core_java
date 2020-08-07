package tech.aistar.day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // 输入第一个整数
        int countOne = scanner.nextInt();
        for(int i = 0; i < countOne; i++){
            // 向集合中添加对应整数个数的元素
            set1.add(scanner.nextInt());
        }
        // 输入第二个整数
        int countTwo = scanner.nextInt();
        // 向集合中添加对应整数个数的元素
        for (int i = 0; i < countTwo; i++){
            set2.add(scanner.nextInt());
        }

        // 创建第三个集合，用于存放两个集合中互不存在的树
        Set<Integer> set3 = new HashSet<>();

        for (Integer value:set1){
            if(set2.add(value)){
                set3.add(value);
            }
        }
        for(Integer value:set2){
            if(set1.add(value)){
                set3.add(value);
            }
        }

        Iterator<Integer> integerIterator = set3.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
