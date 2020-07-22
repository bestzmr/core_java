package tech.aistar.day04.homework02;

/**
 * 本类用来演示:菱形
 *
 * @author: success
 * @date: 2020/7/22 8:31 上午
 */
public class ShapeDemo {
    public static void main(String[] args) {
        test02();
    }

    //打印空心的菱形

    /**
     *        *
     *       * *
     *      *   *
     *     *     *
     *    *       *
     *     *     *
     *
     *
     *  左上 - i=0  j = 4    i=1 j = 3
     *
     *  右上 - i = 0 j = 4  i = 1   j = 5
     *
     *  左下 - i = 4 j=0  i=5 j=1
     *
     *  右下 - i=4 j=8   i=5 j=7
     *
     *
     */
    public static void test(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i + j == 4 || j-i==4 || i-j==4 || i+j==12){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void test02(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i + j < 4 || j-i>4 || i-j>4 || i+j>12){
                    System.out.print(" ");
                }else{

                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
