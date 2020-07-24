# java.lang.Math

这个类中提供了很多关于数学计算的方法.

* static long round(double a);//rounde底层实际就是执行的是Math.floor(a + 1/2);
* static double floor(double a);//返回的是小于或者等于最接近a的整小数
* static double pow(double a,double b);//返回的是a的b次方
* static double sqrt(double a);//开平方根
* static int abs(int a);//重载方法 - 求绝对值
* static double random();//返回的是[0.0,1.0)之间的随机小数
* static int max(int a,int b);//返回的是a和b之间的比较大的值.
* static int min(int a,int b);//返回的是a和b之间的比较小的值.



# 求随机数

java中的随机都是伪随机,有两种方式.

* java.lang.Math类中提供的random()方法.

* java.util.**Random类**中提供的int nextInt(int n);//**返回的就是[0,n)之间的随机整数.**

  ~~~java
  俩个构造方d
  Random();
  Random(long seed);
  构造方法就是决定了如何构建这个对象的方式.
  ~~~

  ~~~java
  //1. import java.util.Random;
  
  //2. 创建Random对象
  Random r = new Random();
  int result = r.nextInt(100)+1;//返回的是[1-100]
  
  //3. 返回3-5之间的随机整数
  ~~~



# java.util.Date

日期类 - 它是一个已经过时的类.因为老的项目中仍然在使用它,所以新的Jdk保留了它,如果新的jdk剔除它,导致老的项目编译不通过.新的项目中已经不推荐使用它了.现在主要使用java.util.Calendar日历类.

jdk8.x中提供了新的关于日期的API



## 构造方法

构造方法是允许重载的.

* Date();//没有过时,获取当前系统的日期
* Date(long time);//没有过时,利用毫秒数来构建一个日期对象.
* Date(int year,int month,int date);//根据指定的年月日来构建一个指定的日期对象.这是一个过时的构造



## 常用的方法

* int getYear();//获取年份
* int getXXX();//获取日期中的字段信息.
* void setXXX(参数列表);//手动一一设置日期中的字段的.



## long和Date之间的转换

* Date类型->long类型

  简介:获取日期的毫秒数,距离1970年1月1日.

  long getTime();

* long类型来构建Date类型

  Date(long time);

  void setTime(long time);















































































































