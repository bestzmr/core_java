package tech.aistar.day04;

/**
 * 本类用来演示: For循环 - 复合形态.
 *
 * @author: success
 * @date: 2020/7/20 4:34 下午
 */
public class ForExercise {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1,j=1; i<=9 ; j++) {
            System.out.print(i+"*"+j+"="+i*j+"\t");
            //当行和列一样的时候 - 换行
            if(i == j){
                System.out.println();
                i++;
                j=0;
            }
        }
    }
}
