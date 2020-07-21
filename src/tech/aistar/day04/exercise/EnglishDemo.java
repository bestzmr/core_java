package tech.aistar.day04.exercise;

/**
 * 本类用来演示: 英文循环的题目
 *
 * @author: success
 * @date: 2020/7/21 11:20 上午
 */
public class EnglishDemo {
    public static void main(String[] args) {
        //1. 定义一个变量 - 保存总的和
        int sum = 1;

        //定义一个变量 - 起始值
        int i = 1;

        //2. 定义一个变量
        //2-1. 每一圈的等差逐渐递增2
        //2-2. 控制循环的次数
        int n = 2;

        while(n<1001){
            i+=n;//i = i + n = 1 + 2 = 3
            sum+=i;//sum = 1 + 3

            i+=n;//i = i + n = 3 + 2 = 5;
            sum+=i;//sum = 1 + 3 + 5

            i+=n;//i = 5 + 2 = 7;
            sum+=i;//sum = 1 + 3 + 5 + 7

            i+=n;//i = 7 + 2 = 9;
            sum+=i;//sum = 1 + 3 + 5 + 7 + 9

            n+=2;//n = 4
        }

        System.out.println(sum);//669171001
    }
}
