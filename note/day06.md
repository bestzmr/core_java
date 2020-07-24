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

  **long getTime();**

* long类型来构建Date类型

  Date(long time);

  **void setTime(long time);**



# java.util.Calendar

简介:java中提供的日历类,它是用来替代Date日期类的使用.

~~~java
public abstract class Calendar {
  
}
abstract - 关键字,抽象的,抽象的类是不能够被实例化的[不能通过new关键字来进行创建对象].
Calendar cal = new Calendar();//error
~~~



## 如何构建对象

static Calendar getInstance();

~~~java
Calendar cal = Calendar.getInstance();
~~~



## 常用方法

* int get(int field);//根据传入的field来返回指定的日历字段.
* void set(int field,int value);//给日历指定的字段设置值.
* **[set](https://www.matools.com/file/manual/jdk_api_1.8_google/java/util/Calendar.html#set-int-int-int-)**(int year, int month, int date);//统一进行赋值.



## 日历字段和日期字段相互转换

* Date getTime();//日历对象调用getTime方法就可以转换成日期类型.
* void setTime(Date date);//Date->Calendar

~~~java
//日期<->long
//long->Date
//1. Date(long time);
//2. void setTime(long time);

//Date->long
//1. void setTime(long time);


//日历->日期
//Date getTime();//java.util.Calendar

//日期->日历
//void setTime(Date d);//java.util.Calendar;
~~~

# 作业

~~~java
请你输入年份:>2020
请你输入月份:>7

日	一	二	三	四	五	六
        1  2  3 4
5  6  7
  
             24*
  
//1. 某年某月的1号是周几
//2. 获取某年某月最大天数
//3. 获取某年某月的日期
//4. 控制换行
~~~















































































































