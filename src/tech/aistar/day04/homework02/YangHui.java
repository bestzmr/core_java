package tech.aistar.day04.homework02;

/**
 * 本类用来演示:打印直角三角形的杨辉三角形
 *
 * @author: success
 * @date: 2020/7/22 8:40 上午
 */
public class YangHui {
    public static void main(String[] args) {
        //System.out.println(getResult(2,1));

        //printYangHui(9);

        System.out.println(jie(6));
    }

    /**
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     *
     * 求出i行,j列对应的杨辉三角的值
     * @param i 行
     * @param j 列
     * @return
     */
    public static int getResult(int i,int j){
        if(j==0 || i == j)
            return 1;
        return getResult(i-1,j-1) + getResult(i-1,j);
    }

    /**
     *
     * @param n 输出的行数
     */
    public static void printYangHui(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
               // System.out.print("*\t");
                System.out.print(getResult(i,j)+"\t");
            }
            System.out.println();
        }
    }

    /**
     * 求出n的阶乘的结果
     * @param n
     * @return
     */
    public static long jie(int n){
        if(n==1)
            return 1;
        return n*jie(n-1);//6*5*jie(4)
    }
}
