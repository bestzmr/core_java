# 数组

简介:常见的8种数据结构:

* 数组

* 栈 - "先进后出",只能操作栈顶的数据.

  基本数据以及对象的引用都是存储在栈里面.特点:空间一旦分配,空间固定了.不可

  动态改变,优势:创建和销毁的速度快 - "空间换时间".

* 队列 - "先进先出" - 队列的两端,都是可以操作的.

* 堆 - 可动态分配,对象就是放在堆里面的

* 链表 - 单向,双向,循环

* 散列表 - hash表

* 树 - 红黑树,B+树[innodb存储引擎-索引的数据结构]

* 图



## 介绍

数组是内存中一段***连续的***空间,连续的空间来存储数据.特点:数组的查询效率很高,但是**增删**

的效率很慢[会涉及到数组下标的移动].**并且数组的长度一旦确定了,那么这个数组就不能改变**.

数组的长度决定了数组中可以存储的数据的个数.

结论:所谓的数组进行增和删都不是对原数组进行直接的操作的.



# 语法

~~~java
定义数组俩个必要条件 - 数组中存放的元素的数据以及数组的长度.

数据类型[] 变量 = new 数据类型[数组长度]
或者
数据类型 变量[] = new 数据类型[数组长度]
  
1. 数据类型可以是八种基本数据类型以及对象类型[内置的以及自定义的].
  
2. 数据类型决定了数组中存放的元素的类型.
  
3. 数组长度决定了数组中可以存放的数据的个数.并且数组长度一旦确定了,将不能再改变了.
  
4. 如果我们没有手动对数组中的元素进行赋值的话,那么系统会默认给数组中的元素初始化.
   整数 - 0 小数 - 0.0  boolean - false  char - 空格   
   对象类型全部是 null
  
5. 通过数组对象.length来访问数组的长度
//比如:定义一个可以存放10个数组的整数的数组
  
//本质 - 
//通过new关键字,在JVM的堆中开辟空间以及初始化一个长度为10的数组对象.
//然后将这个数组在堆内存中的内存地址赋值给了一个引用变量arr,保存在JVM的栈中
//引用和对象之间的关系?
//引用中保存的是对象在堆中的内存地址.

// 满足"🎈"理论
//1. 一个对象在同一个时刻,可以被多个引用指向
  
//2. 一个引用在同一个时刻,只能指向一个对象.
int[] arr = new int[10];

//细节 - arr数组的类型是什么?   int[] - int型数组
//数组本质也是属于对象类型.
~~~



## 数组赋值方式

* 通过下标一一赋值

  因为数组在内存中是连续的空间,因此我们可以通过下标来访问数组中的元素

  下标的范围[0,数组长度-1];千万不要超出这个范围,一旦超出这个范围,那么就会

  抛出一个异常java.lang.ArrayIndexOutOfBoundsException数组下标越界异常.

* 可以通过普通for循环来进行赋值
* 可以在定义数组的同时进行赋值
* 可以先声明一个数组,然后再进行统一赋值.

## 数组的遍历方式

* 通过下标一一获取

  数组对象[下标];

* 可以通过普通for循环来输出数组中的元素.

* jdk5.0以后提供的foreach语法 - 增强for循环(只读的for)

  ~~~java
  for(元素类型 变量:数组对象){
    System.out.println(变量);//变量不是代表下标,就是代表当前遍历到的数组中的实际的元素
  }
  ~~~

* 自定义方式

  ~~~java
  [10,40,50]
  
  public static String toArrayString(int[] arr){
    
  }
  ~~~

* 利用java.util.Arrays数组工具类中提供的数组输出方法.

# 空指针异常

java.lang.NullPointerException - null.东西(属性或者方法)



# Arrays数组工具类

* static String toString(int[] arr);//重载的方法,输出数组

  ~~~java
  public static String toString(int[] a) {
    if (a == null)
      return "null";
    int iMax = a.length - 1;
    if (iMax == -1)
      return "[]";
  
    StringBuilder b = new StringBuilder();
    b.append('[');
    for (int i = 0; ; i++) {
      b.append(a[i]);
      if (i == iMax)
        return b.append(']').toString();
      b.append(", ");
    }
  }
  ~~~



# 数组练习

* 数组长度5个,里面存放1~6之间的随机整数.要求是不能有重复的数据.



# 数组的拷贝和扩容

## java.util.Arrays数组工具类

~~~java
public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
  		  //数组本身也是属于对象类型.而所有的对象类型都拥有一个根类[基类,超类,父类]
  			//所有的对象如果没有明确指定父类,那么都是默认直接继承java.lang.Object
  
        //面向父类编程 - 方法的参数类型定义成父类.那么调用方法的时候,可以传入这个父类的子类对象.
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
~~~



## java.lang.System

~~~java
public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);

  * @param      src      原数组对象
  * @param      srcPos   从原数组中的srcPos下标处开始取数据.
  * @param      dest     目标数组对象
  * @param      destPos  放入到目标数组中的destPos下标处.
  * @param      length   从原数组中拷贝的个数
~~~



# 数组元素查找

* 挨个查找

  ~~~java
  public static int[] getIndexByTarget(int[] arr,int target){
    if(null == arr || arr.length == 0)
      //return null;
      return new int[0];
  
    //1. 思考target在数组中存不存在!
    //1-1. 定义一个变量,用来统计target出现的次数
    int count = 0;
  
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == target)
        count++;
    }
  
    if(count == 0)//说明数组中不存在target元素.
      return new int[0];
  
    //2.确定新数组 - 元素类型以及数组的长度.
    int[] temp = new int[count];//存储target对应的所有的下标的数组
  
    //定义一个下标计数器
    int pos = 0;
  
    //3. 遍历原来的数组
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == target)
        temp[pos++] = i;
    }
  
    return temp;
  }
  ~~~

* 二分查找 - 二分搜索法 - 每次比较完之后,都会减少一半的数据.

  业务中有的数据是唯一的.

  **找出数组中某个元素第一次出现的位置.**

  前提:对排好序的数组可以采用二分查找.

  1,2,3,4,5,6,7,8

  * 起始索引 - startIndex - 0
  * 结束索引 - endIndex - 1
  * 中间索引 - centerIndex = (startIndex + endIndex)/2 = 3

  确定中间索引的值是4.

  * 正好找的值就是4,直接返回centerIndex.

  * 如果找的目标值比中间索引处的值大.

    startIndex = centerIndex+1;

  * 如果找的目标值比中间索引处的值小.

    endIndex = centerIndex-1;

