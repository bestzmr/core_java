package tech.aistar.day14;

import java.util.LinkedList;

/**
 * 本类用来演示:验证输入的括号是否匹配!
 *
 * @author: success
 * @date: 2020/8/10 1:58 下午
 */
public class BracketDemo2 {
    public static void main(String[] args) {
        String str = "[]{}()";
        System.out.println(match(str));
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
        char[] array = bracket.toCharArray();
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case '{':
                case '[':
                case '(':
                    linkedList.push(array[i]);
                    break;
                case '}':
                    if ('{' == linkedList.getFirst()) {
                        linkedList.pop();
                    }
                    break;
                case ']':
                    if ('[' ==  linkedList.getFirst()) {
                        linkedList.pop();
                    }
                    break;
                case ')':
                    if ('(' ==  linkedList.getFirst()) {
                        linkedList.pop();
                    }
                    break;
                default:
            }
        }
        return linkedList.isEmpty();
    }
}
