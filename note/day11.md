# 字符串处理类

* java.lang.String
* java.lang.StringBuilder
* java.lang.StringBuffer



## String类

简介:它是一个不可变的字符串,**字符串的本质是字符数组,**底层源码

~~~java
//使用final进行修饰的,final关键字修饰的类,不能够被子类继承.
public final class String{
    /** The value is used for character storage. */
    private final char value[];//不可变的字符数组.
  
    //String str = "good";
    //如何进行存储,把"good"存储到char value[]中,'g','o','o','d';
}
~~~



### 创建方式

* 利用new关键字来构建一个字符串对象

  ~~~java
  String s = new String("ok");
  面试题问:此处创建了几个对象? - 2个[面试官期望得到的答案],实际情况其实是1个或者2个.
  String s1 = new String("ok");
  原因如下:
  * 如果是第一次执行上面的代码String s = new String("ok");就会创建2个对象.
    分别是new String("ok")以及"ok".它会在堆里面申请区域,初始化字符串对象("ok"->底层的字符数组中).
    同时还会将"ok"对象放一份到常量池中 - 堆和字符串常量池中都会存在对象!
    
  * 当程序执行到String s1 = new String("ok");
    仍然会在堆空间中创建字符串对象,但是轮到常量池的时候,会先到常量池中寻找是否已经存在"ok",发现是存在的. 
    所以在常量池中是不会再次创建重复的"ok"对象的.
    s1默认保存的是堆空间中的内存地址,当然也是有办法让它重新指向串池中的字符串对象的.
  ~~~

  ~~~java
  String s1 = new String("ok");
  String s2 = new String("ok");
  System.out.println(s1 == s2);//false,比较的是值(地址)
  ~~~

* 通过串池的方式[字符串常量池]来构建一个字符串对象

  ~~~java
  String s3 = "abc";//此处就仅仅只会1个对象,并且将这个对象扔到JVM内存的常量池区域中.
  String s4 = "abc";//其实是每次通过串池的方式创建字符串的时候,优先先到字符串常量池中去寻找是否已经存在字符串"abc",如果找到,直接将"abc"的地址赋值给s4,如果没有了,那么就在常量池扔一个对象"abc",把地址赋值给s4.
  System.out.println(s3 == s4);//true
  ~~~



### 字符串的拼接

字符的拼接使用的是+进行拼接.性能比较低下.why?

结论:因为字符串每次拼接的时候,都会产生一个新的对象(StringBuilder).

然后接下来+,就是代表StringBuilder类中提供的append方法.

~~~java
String s1 = "a"+"b"+"c";//此处在串池中创建了几个对象 - 5个
"a" "b" "ab" "c" "abc"
~~~

~~~java
public class StringDemo{
    public static void main(String[] args){
        String s3 = "abc";

        //StringBuilder b1 = new StringBuilder(s3);

        //b1.append("aa");
        String s4 = s3 + "aa";
        String s5 = s4 + "cc";
    }
}
admindeMacBook-Pro:Desktop admin$ javap -c StringDemo
Compiled from "StringDemo.java"
public class StringDemo {
  public StringDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String abc
       2: astore_1
       3: new           #3                  // class java/lang/StringBuilder
       6: dup
       7: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      10: aload_1
      11: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: ldc           #6                  // String aa
      16: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      22: astore_2
      23: new           #3                  // class java/lang/StringBuilder
      26: dup
      27: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      30: aload_2
      31: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: ldc           #8                  // String cc
      36: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      42: astore_3
      43: return
}
~~~



# 设计模式

## 设计模式概念

设计模式（Design Pattern）**是一套被反复使用、多数人知晓的、经过分类的、代码设计经验的总结**。

使用设计模式的目的：为了**代码可重用性**、让代码更容易被他人理解、保证代码可靠性。 设计模式使代码**编写真正工程化**；设计模式是软件工程的基石脉络，如同大厦的结构一样。

项目中合理地运用设计模式可以完美地解决很多问题，每种模式在现实中都有相应的原理来与之对应，**每种模式都描述了一个在我们周围不断重复发生的问题，以及该问题的核心解决方案**，这也是设计模式能被广泛应用的原因。



总体来说设计模式分为三大类：

**创建型模式**，共五种：**工厂方法模式**、**抽象工厂模式**、**单例模式**、**建造者模式**、**原型模式**。

**结构型模式**，共七种：适配器模式、**装饰器模式**、代理模式、外观模式、桥接模式、组合模式、享元模式。

**行为型模式**，共十一种：策略模式、**模板方法模式**、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

**其实还有两类：并发型模式和线程池模式**



## 简单工厂

简单工厂模式是属于创建型模式，**但不属于23种GOF设计模式之一**。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式，可以理解为是不同工厂模式的一个特殊实现。简单工厂一般分为：**普通简单工厂**、**多方法简单工厂**、**静态方法简单工厂**。 



### 普通简单工厂

~~~java
package tech.aistar.design.factory.common.test01;

/**
 * 本类用来演示:普通简单工厂
 * 作用:根据传入的参数,来返回具体的某个产品
 *
 * @author: success
 * @date: 2020/8/3 9:58 上午
 */
public class SenderFactory {

    //多态的应用 - 面向接口编程
    //3 - 方法的返回类型写成接口,方法体的返回值可以写成这个接口的任何一个实现类对象
    public Sender getInstance(String product){
        Sender sender = null;
        //一个工厂是可以创建多个产品的.
        if("QQ".equals(product)){
            sender = new QQSender();
        }else if("WX".equals(product)){
            sender = new WXSender();
        }else{
            System.out.println("对不起,产品不存在!");
        }
        return sender;
    }
}
~~~



### 多方法简单工厂

~~~java
package tech.aistar.design.factory.common.test02;

/**
 * 多方法简单工厂 - 每个产品对应一个创建方法
 *
 * 当新增一个产品的时候,还是动工厂类 - 不符合"开闭原则"
 * 
 *
 * @author: success
 * @date: 2020/8/3 9:58 上午
 */
public class SenderFactory {

    public Sender produceQQ(){
        return new QQSender();
    }

    public Sender produceWX(){
        return new WXSender();
    }
}
~~~



### 静态方法简单工厂

~~~java
package tech.aistar.design.factory.common.test03;

/**
 * 静态方法简单工厂 - 每个产品对应一个创建方法
 *
 * 当新增一个产品的时候,还是动工厂类 - 不符合"开闭原则"
 *
 *
 * @author: success
 * @date: 2020/8/3 9:58 上午
 */
public class SenderFactory {

    public static Sender produceQQ(){
        return new QQSender();
    }

    public static Sender produceWX(){
        return new WXSender();
    }
}
~~~



### 简单工厂优缺点

优点：

- 很明显，简单工厂的特点就是“简单粗暴”，通过一个含参的工厂方法，我们可以实例化任何产品类，上至飞机火箭，下至土豆面条，无所不能。所以简单工厂有一个别名：上帝类。

缺点：

- 任何”东西“的子类都可以被生产，负担太重。当所要生产产品种类非常多时，工厂方法的代码量可能会很庞大
- **在遵循开闭原则（对拓展开放，对修改关闭）的条件下，简单工厂对于增加新的产品，无能为力。因为增加新产品只能通过修改工厂方法来实现。**



### 拓展

开发中的简单工厂设计模式的应用 - **反射工厂**

* ***反射创建对象***

  * 获取的类的class实例

  * 调用newInstance方法

  * 代码

    ~~~java
    //1. 获取类的class实例
    try {
      Class<?> c = Class.forName("tech.aistar.design.factory.common.test04.QQSender");
    
      //2. 反射创建对象
      Sender qq = (Sender) c.newInstance();
    
    } catch (ClassNotFoundException e) {//类的全限定名不能写错
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    }
    ~~~

    