package tech.aistar.day04.homework02;

import java.util.Scanner;

/**
 * 本类用来演示:猜数字游戏
 *
 * @author: success
 * @date: 2020/7/22 9:19 上午
 */
public class GuessNumDemo {
    public static void main(String[] args) {
        //1. 导包
        //2. 创建Scanner对象

        //在jdk7.0之前,是要求sc必须要关闭的 - 获取键盘输入流[昂贵的资源]
        Scanner sc = new Scanner(System.in);

        //1. 产生一个随机数 - java中的随机数都是伪随机
        int n = (int) (Math.random()*100+1);//[1,100]之间的随机整数
        System.out.println("幸运数:"+n);

        //2. 定一个变量 - 猜数字的次数
        int count = 0;

        //3. 定义两个变量,最小边界和最大边界
        int start = 1;

        int end = 100;

        //System.out.println("=====猜数字游戏=====");

        //定义一个标记位
        boolean flag = true;

        do{

            if(flag) {
                System.out.println("=====猜数字游戏=====");
                //拼接printf

                //%s - 代表的是字符串

                //%d - 代表的是数字

                System.out.printf("请你猜数,范围[%d,%d]>",start,end);

                flag = false;
            }
            int num = sc.nextInt();
            //判断num和幸运数字的比较
            if(num<n){
                start = num;
                System.out.printf("太小了,范围[%d,%d]>",start,end);
                count++;
            }else if(num>n){
                end = num;
                System.out.printf("太大了,范围[%d,%d]>",start,end);
                count++;
            }else{
                count++;
                System.out.printf("恭喜您猜中了,幸运数字是[%d],总共猜了[%d]次\n",n,count);
                flag = true;

                //break;
            }


        }while(true);

        //sc.close();
    }
}
