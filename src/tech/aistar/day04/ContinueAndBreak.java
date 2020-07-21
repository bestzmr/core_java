package tech.aistar.day04;

/**
 * 本类用来演示:continue和break
 *
 * @author: success
 * @date: 2020/7/21 9:59 上午
 */
public class ContinueAndBreak {
    public static void main(String[] args) {
        //学会使用debug来调试我们的程序.
        for (int i = 0; i < 6; i++) {
            if(i==3)
                continue;//跳过本轮循环,但是会继续下一轮循环
                //当执行到continue语句的时候,下面的代码将不再执行.
            System.out.println(i);
        }

        System.out.println();

        int count = 0;

        //success代码块的名称
        success:{
            if(count == 0)
                break success;//break 代码块名称; 跳出代码块
            System.out.println("代码块");
        }

        System.out.println("outside");

        for (int i = 0; i < 6; i++) {
            if(i == 3)
                break;//打破当前所在的这一层循环
            System.out.println(i);
        }

        System.out.println("outfor");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(j==2){
                    break;
                }
                System.out.println(i+"->"+j);
            }
        }
    }
}
