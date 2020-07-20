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

