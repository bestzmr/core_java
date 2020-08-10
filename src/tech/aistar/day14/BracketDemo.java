package tech.aistar.day14;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 本类用来演示:验证输入的括号是否匹配!
 *
 * 四则运算  - 1 + 2 * 3 + (5-2) = ?
 *
 * @author: success
 * @date: 2020/8/10 1:58 下午
 */
public class BracketDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入括号:>");
        String line = sc.nextLine();

        if(match(line)){
            System.out.println("匹配");
        }else{
            System.out.println("不匹配!");
        }
    }

    /**
     * 思路:
     * 获取键盘输入nextLine - [({})]
     * 把这个字符串打散成字符串数组.
     *
     * //新建一个LinkedList集合.然后将数组中的第一个元素压入栈顶.
     * list.push(arr[0]);//   [
     *
     * //从数组的第二个元素开始遍历.( { } ) ]
     *
     * 1. 获取栈顶元素,然后和当前遍历的数组的元素进行比较
     *    a. [ 和 ( -> 不匹配 -> 将当前的元素继续压入栈顶
     *       list -> [ (
     *
     *       循环遍历比较...
     *       list ->
     *    b . 如果当前的元素和栈顶元素匹配了,那么就弹出栈顶元素.
     *
     * 匹配的情况 - 判断list.isEmpty();//判断集合中是否存在元素.
     *
     */
    public static boolean match(String bracket){
        //1. 将字符串转换成字符数组.
        char[] arr  = bracket.toCharArray();

        //2. 创建一个LinkedList集合对象
        LinkedList<Character> list = new LinkedList<>();

        //3. 将数组中的第一个元素压入栈顶.
        list.push(arr[0]);

        //4. 从arr数组的第二个位置开始遍历
        for (int i = 1; i < arr.length; i++) {
            //4-1. 获取当前遍历的元素
            Character c = arr[i];//jdk5支持的封箱功能.

            //6-1. 判断list中是否存在元素
            Character top = null;

            if(list.isEmpty()){
                list.push(c);
                continue;//跳过本轮循环,继续下一轮新的循环.
            }else{
                top = list.getFirst();
            }

            //5. 判断当前元素和栈顶元素是否匹配
            if((top.equals('(') && c.equals(')')) || (top.equals('[') && c.equals(']')) || (top.equals('{') && c.equals('}'))){
                //5-1.如果匹配,弹出栈顶内容
                list.pop();
            }else{
                //5-2. 如果不匹配,继续将当前的元素压入栈顶.
                list.push(c);
            }
        }
        return list.isEmpty();
    }
}
