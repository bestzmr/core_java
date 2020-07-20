package tech.aistar.day04;

/**
 * 本类用来演示:买奶茶的业务
 *
 * 编程从定义变量开始...
 *
 * 规定 - 奶茶单价 - 10.0
 *
 * 10.0  5.0  10.0   5.0  10.0 ...
 *
 * 每第二杯半价
 *
 * 求出总价
 *
 * @author: success
 * @date: 2020/7/20 3:12 下午
 */
public class NaiTeaDemo {
    public static void main(String[] args) {
        //定义奶茶的单价
        double price = 10.0d;

        //定义购买的数量
        int cup = 5;

        //写一段程序 - 计算出总价.
        //定义一个变量,用来保存总价
        double total = price/2*(cup/2) + price*(cup/2);

        //位运算 - 性能是最高的.
        //10 - 1 0 1 0
        //9 - 1 0 0 1
        //    0 0 0 1

        if((cup & 1) == 1){
            total+=price;
        }

        //判断是否为奇数
//        if(cup % 2 != 0)
//            total+=price;

        System.out.println(total);
    }
}
