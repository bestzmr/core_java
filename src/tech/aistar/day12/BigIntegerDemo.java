package tech.aistar.day12;

import java.math.BigInteger;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 2:16 下午
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        System.out.println(fac(6));
    }

    public static BigInteger fac(int n){
        //1. 构建一个BigInteger对象
        BigInteger bigInteger = new BigInteger(String.valueOf(n));

        //2. 判断递归的出口
        if(n == 1){
            return BigInteger.ONE;
        }
        //return n*fac(n-1);
        return bigInteger.multiply(fac(n-1));
    }
}
