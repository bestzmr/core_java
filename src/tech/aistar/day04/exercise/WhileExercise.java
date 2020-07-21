package tech.aistar.day04.exercise;

/**
 * 本类用来演示:循环练习
 *
 * @author: success
 * @date: 2020/7/21 10:28 上午
 */
public class WhileExercise {
    public static void main(String[] args) {
        System.out.println(getBitCounts2(546782));
    }

    /**
     * 给一个数字,返回这个数字是几位数.比如传递一个数字为324,返回值3
     *
     * 思路:
     * 1 - 将n不断除10,除一次,计数一次
     * 2 - 除到商是0结束.
     *
     * @param n
     * @return
     */
    public static int getBitCounts(int n){
        //1. 计数器
        int count = 0;
        //2. 推荐
        while(true){
            int s = n / 10;// 324/10 = 32 / 10 = 3 / 10 = 0
            count++;

            if(s == 0){
                break;
            }

            n = s;
        }
        return count;
    }

    public static int getBitCounts2(int n){
        //1. 计数器
        int count = 1;//数字至少是1位

        while(n / 10 !=0){
            count++;
            n = n / 10;
        }

        return count;
    }
}
