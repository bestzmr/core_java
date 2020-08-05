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























