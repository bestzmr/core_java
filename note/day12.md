# 包装类型

简介:属于对象类型,***八种基本数据类型都有对应的包装类型.***

* **byte - Byte**
* **short - Short**
* **int - Integer**
* **long - Long**
* **float - Float**
* **double - Double**
* char - Character
* boolean - Boolean

上面所有的关于数字类型的包装类型都会有一个共同的抽象的父类**java.lang.Number**



# Number

提供了包装类型转换成对应的基本数据类型.

* int intValue();//Integer -> int类型 - 包装类型转换成对应的基本数据类型
* long longValue();
* float floatValue();
* double doubleValue();
* byte byteValue();
* short shortValue();



# 学习目标

* 基本数据类型和包装类型以及字符串String三者之间的相互转换.



# Integer

简介:int类型对应的包装类型Integer

## 构造

* Integer(int i);//利用int类型来构建一个Integer对象.  int类型转换成Integer类型

* Integer(String s);//利用**数字形式的字符串**来构建一个Integer对象.

  String类型转成Integer类型,

  ```
  如果传入的不是一个数字形式的字符串,将会抛出一个异常
  //java.lang.NumberFormatException - 数字格式化失败异常
  ```



## 自动解封箱

简介:jdk5.0以后才提供的自动解封箱的操作

* 封箱 - 基本数据类型可以自动转换成包装类型
* 解箱 - 包装类型可以自动转换成基本数据类型



## 常用方法

* static Integer valueOf(int i);//int -> Integer

  发现在Integer内部存在一个静态的内部类IntegerCache - Integer的常量的缓冲池.

  ~~~java
      private static class IntegerCache {
          static final int low = -128;
          static final int high;//静态代码块中进行赋值127
          static final Integer cache[];//一个缓冲池 - 维护了Integer类型的数组.
      }
  ~~~

  

  ~~~java
   public static Integer valueOf(int i) {
          if (i >= IntegerCache.low && i <= IntegerCache.high)
              return IntegerCache.cache[i + (-IntegerCache.low)];
          return new Integer(i);
      }
  ~~~

  

* static Integer vlaueOf(String s);// String -> Integer,必须是数字形式的字符串

* static int parseInt(String s);//String -> int
* 关于进制换算的三个方法



## 类型转换

* String类型和int类型

  * int类型->String类型
    * 调用java.lang.String类中提供的static String valueOf(int n);

  * String类型 -> int类型
    * 调用java.lang.Integer类中的static int parseInt(String s);

* String类型和Integer类型

  * String类型 -> Integer类型
    * 调用Integer的构造方法Integer(String s);//必须是数字形式的字符串
    * 调用Integer类中提供的static Integer valueOf(String s);

  * Integer类型 -> String类型
    * 调用String类中提供的static String valueOf(Object obj);
    * 调用Integer类中提供的String toString();

* int类型和Integer类型

  * int -> Integer
    * 调用Integer(int n)构造方法
    * jdk5.0中开始提供的自动封箱的过程
    * 调用Integer中提供的static Integer valueOf(int n);

  * Integer -> int
    * 调用java.lang.Number抽象父类中int intValue();
    * jdk5.0开始提供的自动解箱的过程.



## int和Integer之间的区别

* int是基本数据类型,Integer是对象类型,int类型的包装类型

* int类型的默认值是0,Integer的默认值是null

* int类型通常使用==比较,保存的是值,Integer使用equals方法,变量中存储的是引用地址.

* 以后推荐实体类中优先使用包装类型.

  ~~~java
  private Integer id;
  private Double price;
  ~~~



# 大数字对象类型

* java.math.BigInteger
* java.math.BigDecimal



## BigInteger

* 构造BigInteger(String val);//数字形式的字符串
* 观察方法,运算符号 -> api方法.

了解一下即可.

## 实现阶乘

~~~java
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
~~~



## 小数精度丢失解决

~~~java
package tech.aistar.day12;

import java.math.BigDecimal;

/**
 * 本类用来演示:可以使用BigDecimal对象来处理小数运行的时候精度丢失的问题
 *
 * @author: success
 * @date: 2020/8/5 2:21 下午
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double d = 0.1d;

        //double -> String
        String first = String.valueOf(d);
        
        //String -> double

        BigDecimal b1 = new BigDecimal(first);
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));

        System.out.println(0.1 + 0.2);
    }
}
~~~















