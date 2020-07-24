package tech.aistar.day05.homework;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/24 8:51 上午
 */
public class PeomDemo {
    public static void main(String[] args) {
        String[][] arr = {
                {"白", "日", "依", "山", "尽", "，"},
                {"黄", "河", "入", "海", "流", "。"},
                {"欲", "穷", "千", "里", "目", "，"},
                {"更", "上", "一", "层", "楼", "。"}
        };

        test02(arr);
    }

    /**
     *[白, 日, 依, 山, 尽, ，, 黄, 河, 入, 海, 流, 。, 欲, 穷, 千, 里, 目, ，, 更, 上, 一, 层, 楼, 。]
     *
     * 白黄 .. -> 第一行->  0   6   12    18
     * 日河 .. -> 第二行 -> 1   7   13    19
     *     ..    第三行 -> 2   8    14   20
     *
     *
     *      i和j满足什么关系?  i,j = 0    -> 0
     *                      i=1,j=0 -> 1     i=1,j=1 -> 7    j*6+i
     * @param arr
     */
    public static void test02(String[][] arr){
        //先将二维数组中的所有的元素 -> 一维数组中.
        String[] temp = new String[arr.length*arr[0].length];

        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[pos++] = arr[i][j];
            }
        }

       // System.out.println(Arrays.toString(temp));

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                //输出一行...
                System.out.print(temp[j*6+i]);
            }
            System.out.println();
        }
    }

    /**
     * 利用了二维数组的行列特性
     * @param arr
     */
    public static void test01(String[][] arr){
        //1. 定义一个二维数组,用来保存竖着的.
        //竖着的列行=横着的行列
        String[][] temp = new String[6][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
