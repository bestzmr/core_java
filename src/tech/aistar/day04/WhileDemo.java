package tech.aistar.day04;

/**
 * 本类用来演示:while循环语法
 *
 * @author: success
 * @date: 2020/7/21 9:53 上午
 */
public class WhileDemo {
    public static void main(String[] args) {
        //while循环实现输出 1-10
        int i = 1;
        while(i<=10){
            System.out.print(i);
            i++;
        }
        System.out.println();

        //死循环... 一定要有打破循环的语句
        int j = 0;
        boolean flag = true;
        while(flag){
            //System.out.println("死循环...");
            j++;
            System.out.print(j);

            if(j == 10)
                flag = false;
        }

        System.out.println("===推荐===");

        int count = 0;

        while(true){
            count++;
            System.out.println(count);
            if(count==10){
                break;
            }
        }
    }
}
