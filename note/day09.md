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