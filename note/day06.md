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

  

