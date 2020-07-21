# 语句对象

* 条件分支语句

  * if和else
  * switch...case语法
  * 三元运算符[三目运算符]

* 循环语句

  * 后置循环语句

    * for循环
      * 单层for循环
      * 嵌套for循环
      * for循环的复合形态

    * while循环

  * 前置循环语句

    * do...while循环



# if和else

* if语句可以单独使用

  ~~~java
  if(表达式){//1. 条件表达式  2. boolean类型的变量
    //if块中的程序
    //当表达式返回结果是true的时候,才会执行{}中的代码
  }
  ~~~

  如果if{}中的代码只有一行的时候,那么{}是可以省略不写的

  ~~~java
  if(表达式)
    //{}可以省略不写...
    System.out.println("只要一行代码的时候");
  ~~~

* if和else一起配合使用

  ~~~java
  if(表达式){
    //条件成立...
  }else{
    //条件不成立
  }
  ~~~

* if...else if...else if...else

  一定要注意条件是要互斥的

  ~~~java
  if(score>=90){
    System.out.println("优秀!");
  }else if(score>=80){
    System.out.println("良好!");
  }else{
    System.out.println("差!");
  }
  ~~~

* if...else或者if...else if..else...

  支持嵌套使用的.

  ~~~java
  if(表达式){
    if(表达式){
      if(表达式){
        
      }else if(表达式){
        
      }else{
        
      }
    }
  }else{
    
  }
  ~~~

  

# 三元运算符

* 表达式(或者boolean)?result1:result2;

  如果表达式为true,则执行result1,否则执行result2

* 嵌套使用的 - 不推荐

  表达式1?(表达式2?result1:result2):表达式3



# For循环

后置循环 - 判断循环的条件是否成立.如果成立,则执行循环体中的程序,否则直接退出.

~~~java
for(表达式1;表达式2;表达式3){
  循环体
}
①表达式1 - 循环变量因子的初始值.比如:int i = 0;
  只会执行一次
②表达式2 - 循环退出的条件.比如i<=5
  至少执行1次.
    
③表达式3 - 循环变量因子在每次经过循环的时候的变化值.比如:i++
  可能执行,可能不执行.
  
for(int i=0;i<=5;i++){
  System.out.println(i);
}
~~~



三个表达式都是可以省略不写的场景

~~~java
for(;;){
  //死循环...
}
~~~



省略循环体

~~~java
for(表达式1;表达式2;表达式3);
~~~



## for循环的复合形态

~~~java
for(int i=0,j=0;i<=5 && j<=5;i++,j++){
  
}
~~~



## 嵌套for循环

for循环中继续嵌套for循环,但是在实际开发中一般不允许超过三层.嵌套越多,性能越低.

* **外层循环和内层循环无关(优先推荐使用)**

  内层循环可以单独运行 - 内层循环并没有使用到外层循环的变量因子i

  ~~~java
   public static void square(int n){
     //外层循环执行一次,内层循环执行全部.
  
     for (int i = 0; i < n; i++) {//外层for循环 - 控制行数
  
       //内层循环是作为外层循环的循环体存在的
       for (int j = 0; j < n; j++) {//内层循环 - 控制列数
         System.out.print("#");
  
         //格式化输出
         // System.out.printf("%2s","#");
       }
  
       //换行...
       //System.out.println();
       System.out.print("\n");
     }
   }
  ~~~

  

* 外层循环和内层循环相关

  内层循环使用到了外层循环的变量因子

  ~~~java
  /**
       * 内层循环和外层循环相关
       * *
       * * *
       * * * *
       * * * * *
       * * * * * *
       * * * * * * *
       * @param n
       */
      public static void triangle(int n){
          for (int i = 0; i < n; i++) {
  
              for (int j = 0; j <=i; j++) {
                  System.out.print("#  ");
              }
  
              System.out.println();
          }
      }
  ~~~

  

  ## 练习嵌套for循环

  输出所有的三位数.

  要求:

  1. 这个三位数由数字1,2,3,4中的三个数字组成
  2. 不能出现重复的数字.
  3. 每6个换一行输出.



# while循环

后置循环 - 优先判断循环条件,成立则进入循环体,否则直接退出

应用场景:当不知道循环多少次,但是知道循环退出的条件的时候! - while循环.

~~~java
while(条件表达式){
  //循环体...
}

while(true){
  //死循环,for(;;){}
}
~~~



# continue和break

* continue语句最外层必然肯定会存在循环语句.

  跳过当前循环,但是会继续下一轮循环.

* break语句 

  * 跳出switch块.
  * 跳出代码块 - 不推荐使用
  * 跳出当前所在的那一层循环.



# 循环练习

* 给一个数字,返回这个数字是几位数.比如传递一个数字为324,返回值3

* 求出俩个数的最大公约数和最小公倍数

* 输出101-199之间的所有的质数,每7个换一行

* 给定一个十进制的数(正整数),输出这个十进制数的最精简的二进制

  比如10 -> 1010





























