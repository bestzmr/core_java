# 总结昨日

***markdown - 半个小时***

* jvm - 跨平台性(java语言),但是jvm是不跨平台的

  ![](imgs/jvm.png) 



* 执行的流程

  ![](imgs/execute.png) 

* jdk和jre和jvm

  ![](imgs/jvm_jre_jdk.png) 

# 变量

java中就是使用**变量和数据类型**来定义和存储数据的.数据存储的介质 - 磁盘和内存.

内存中的数据需要持久化[保存]到磁盘中.编程的核心就是对数据进行CRUD操作[create,retrieve,update,delete]

增删改查.

现阶段:数据都是在内存中的.java只能操作内存中的数据.



## 变量的分类

* ***基本数据类型***

  常规说法是八大种(byte,short,int,long,float,double,char,boolean)

  ***编程思想***书籍中将void归类为基本数据类型[九大基本数据类型].

* 对象类型

  * 内置对象类型(jdk中已经内置的) - 比如System,String,Date...
  * 自定义对象类型[开发者自己写的] - **无数种**



# 基本数据类型图

byte,short,int,long - 表示整数的

float和double都是用来表示小数的.**只是double会比float多消耗两倍的内存空间.**

![](imgs/base_type.png) 





# 变量定义和使用

变量的命名请参考类的命名,唯一的区别,推荐使用小驼峰命名.[helloWorld]

~~~java
语法:
数据类型 变量名 [= 初始值];
定义一个int类型的变量,并且初始值设置成10;

//代码的背后
//
int i = 10;
~~~





































