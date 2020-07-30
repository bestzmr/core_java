# static关键字

* static修饰方法 - 静态方法 - 类调用
* static修饰属性 - 静态属性 - 类变量 - **类拥有的,对象共享的**
* static修饰代码块 - 静态代码块
* 静态导入包
* 静态内部类 - [以后讲]



## 简介

static修饰的成员(方法或者属性)初始化的时机:当JVM加载类进内存的时候,就会优先给静态成员分配空间

以及初始化,并且赋值的机会只有一次,和创建多少个对象无关!

**static修饰的成员,在内存中的实例只有一个,属于类实例,和对象无关!!!**



## 活动过程

***JVM内存模型 - 栈,堆,方法区.***

JVM加载类进内存的活动过程.

* JVM加载需要的类进内存.
* 立即会给静态属性分配空间以及初始化[赋值]
* 接着,会给静态方法分配空间以及初始化.
* 调用静态代码块
* 如果遇到了创建对象的语法
  * 会给所有的非静态属性分配空间以及初始化
  * 接着,会给所有的非静态方法分配空间以及初始化
  * 调用普通代码块
  * 调用构造块



## 拓展

Hello.java

~~~java
public class Hello{
    static{
        id = 1;
    }

    private static int id = 5;

    public static void main(String[] args){
        System.out.println(id);//5
    }
}
~~~

~~~java
admindeMacBook-Pro:Desktop admin$ javap -c Hello
Compiled from "Hello.java"
public class Hello {
  public Hello();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: getstatic     #3                  // Field id:I
       6: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
       9: return

  static {};
    Code:
       0: iconst_1
       1: putstatic     #3                  // Field id:I
       4: iconst_5
       5: putstatic     #3                  // Field id:I
       8: return
}
~~~

第二种:

~~~java
public class Hello{
    private static int id = 5;
  
    static{
        id = 1;
    }
    public static void main(String[] args){
        System.out.println(id);//1
    }
}
~~~

~~~java
admindeMacBook-Pro:Desktop admin$ javap -c Hello
Compiled from "Hello.java"
public class Hello {
  public Hello();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: getstatic     #3                  // Field id:I
       6: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
       9: return

  static {};
    Code:
       0: iconst_5
       1: putstatic     #3                  // Field id:I
       4: iconst_1
       5: putstatic     #3                  // Field id:I
       8: return
}

~~~



## 静态导入

~~~java
package tech.aistar.day09;

//import static java.util.Calendar.YEAR;
//import static java.util.Calendar.MONTH;

import java.util.Calendar;

//静态导入静态成员.
import static java.util.Calendar.*;

/**
 * 本类用来演示:静态导入
 *
 * @author: success
 * @date: 2020/7/30 10:16 上午
 */
public class StaticImport {
    public static void main(String[] args) {
        //    public final static int YEAR = 1;
       // System.out.println(Calendar.YEAR);
        System.out.println(YEAR);

        System.out.println(MONTH);

        Calendar cal = getInstance();
    }
}

~~~



# private和static

* 父类中的private私有方法是不能够被子类重写的.

  因为私有的成员是父类自己的,它是对子类也是不可见的.

  **继承其实破坏了封装性 - 一旦子类继承了父类,相当于父类把细节暴露给子类.**



* 父类中的静态static方法是不会被子类重写的.

  静态方法是不存在多态的.



# 内部类

简介 - 不推荐你们在编程中使用,但是只要能看懂即可.

* 成员内部类 - 把内部类作为外部类的成员.

  * 不能定义静态变量

  * 可以访问外部类的静态和非静态属性.

  * 创建对象语法:

    ~~~java
    外部类.内部类 对象名 = 外部类对象.new 内部类();
    ~~~

    

* 静态内部类

* 局部内部类

* 匿名内部类 - 推荐掌握即可