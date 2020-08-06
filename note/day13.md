# 大纲

* 泛型
* 正则表达式
* 异常处理机制



# 泛型

* 认识泛型符号
* 什么是泛型
* 为什么需要泛型
* 泛型类
* 泛型方法
* 泛型类派生出来的子类
* 泛型通配符
* 设置泛型通配符界限
* 泛型擦除
* 泛型K,V



## 泛型的诞生

简介:Jdk5.0开始引入了泛型.

~~~java
package tech.aistar.day13;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:借助于集合框架来理解泛型的引入
 *
 * @author: success
 * @date: 2020/8/6 8:55 上午
 */
public class JDK5BeforeDemo {
    public static void main(String[] args) {
        //最顶级的集合接口java.util.Collection[I]
        //顶级接口下拥有List子接口[I] - 常用的集合实现类ArrayList[C]
        //集合是用来替代数组的使用的.

        //在jdk5.0之前还没有引入泛型的时候,如何创建集合对象呢?
        //jdk5.0之前的集合框架 - 类型不安全的框架
        List list01 = new ArrayList();
        //我们是可以向这个集合中添加任意的数据类型的.

        //没有看到任何泛型之前,add(Object obj);

        //并没有对添加到集合中的数据进行类型的校验.
        list01.add(10);//ok
        list01.add("ok");//ok
        list01.add(null);

        String result01 = (String) list01.get(1);
        System.out.println(result01);

        System.out.println(list01);

        //jdk5.0开始引入了泛型.
        //list02中就只能添加Long类型
        //保证了程序在编译期间的类型的安全.

        //泛型只能使用对象类型. - 本质:类型的参数化,就是把类型当成参数进行传递.
        List<Long> list02 = new ArrayList<Long>();
        list02.add(100L);
        list02.add(200L);

        System.out.println(list02);
        
        //jdk7.x以后 - new ArrayList<>中的泛型是可以省略不写的.why???
        List<String> list03 = new ArrayList<>();
        list03.add("ok");
        list03.add("ok");

        list03.add("good");



        System.out.println(list03);

        //只要程序在编译期间不报错,添加到容器中的数据的类型是属于泛型的
        //那么在运行期间涉及到转换类型的时候,肯定不会报错.
        String result02 = list03.get(1);//编译期间ok
        System.out.println(result02);
    }
}

~~~





## 泛型符号

* E - 元素-对象,应用在集合中.表示可以添加到集合容器中的数据的类型.
* T - 类型
* N - 数字
* K,V - 键值对,K-键,V-值
* ***? - 比较特殊,泛型通配符***



## 什么是泛型

Java泛型设计原则：只要在编译时期没有出现警告，那么运行时期就不会出现ClassCastException异常

泛型：**把类型明确的工作推迟到创建对象或调用方法的时候才去明确的特殊的类型**



**参数化类型:**

- **把类型当作是参数一样传递** - 隐形的
- **`<数据类型>` 只能是引用类型** - 泛型只能是对象类型



## 为什么需要泛型

**早期Java是使用Object来代表任意类型的，但是向下转型有强转的问题，这样程序就不太安全**

首先，我们来试想一下：没有泛型，集合会怎么样 - ***jdk5.x为什么要引入泛型???***

- Collection、Map集合对元素的类型是没有任何限制的。**本来我的Collection集合装载的是全部的Dog对象，但是外边把Cat对象存储到集合中，是没有任何语法错误的。**

- 把对象扔进集合中，集合是不知道元素的类型是什么的，仅仅知道是Object。因此在get()的时候，返回的是Object。**外边获取该对象，还需要强制转换**

  

***有了泛型以后:***

- 代码更加简洁【不用强制转换】
- 程序更加健壮【只要编译时期没有警告，那么运行时期就不会出现ClassCastException异常】
- 可读性和稳定性【在编写集合的时候，就限定了类型】

~~~java
//没有引入泛型...
//涉及到强制类型转换的时候 -> 涉及到java.lang.ClassCastException类型转换失败异常.
Animal dog = new Dog();
Cat c = (Cat)dog;//编译期间是通过的,但是在程序的运行期间是报错的.

 String result01 = (String) list01.get(1);
 System.out.println(result01);


//引入了泛型
//只要程序在编译期间不报错,添加到容器中的数据的类型是属于泛型的
 //那么在运行期间涉及到转换类型的时候,肯定不会报错.
 String result02 = list03.get(1);//编译期间ok
 System.out.println(result02);
~~~



## 泛型类

**泛型类就是把泛型定义在类上，用户使用该类的时候，才把类型明确下来**....这样的话，用户明确了什么类型，该类就代表着什么类型...用户在使用的时候就不用担心强转的问题，运行时转换异常的问题了。

~~~java
package tech.aistar.day13;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 9:51 上午
 */
public class ObjectTools<T> {

    public T get(T t){
        return t;
    }

    //没有泛型的时候 - 都是使用object类型
    public Object find(Object obj){
        return obj;
    }
}
class TestTools{
    public static void main(String[] args) {
        ObjectTools<String> tools = new ObjectTools<>();

        String result01 = tools.get("ok");
        
        //编译期间一旦不会出现问题,程序运行期间就不会抛出类型转换失败的异常.
        //Integer tt = tools.get("ok");
        
        System.out.println(result01);

        ObjectTools<Integer> tools1 = new ObjectTools<>();
        Integer result02 = tools1.get(100);
        System.out.println(result02);

        ObjectTools t = new ObjectTools();

        //编译期间是正常的,但是运行期间存在类型转换失败的风险
        Integer s = (Integer) t.find("ok");
        System.out.println(s);
    }
}

~~~



## 泛型方法

我们可能就仅仅在**某一个方法上需要使用泛型**....**外界仅仅是关心该方法，不关心类其他的属性**...这样的话，我们在整个类上定义泛型，未免就有些大题小作了.

~~~java
package tech.aistar.day13;

/**
 * 本类用来演示:泛型方法
 *
 * 假设某个类中就那么几个方法需要使用泛型,那么就没有必要设置成泛型类.
 *
 * @author: success
 * @date: 2020/8/6 10:17 上午
 */
public class GenericDemo {

    /**
     * 无返回类型
     */
    public <E> void show(E e){
        System.out.println(e);
    }

    /**
     * 带返回类型
     * @param t
     * @param <T>
     * @return
     */
    public <T> T add(T t){
        return t;
    }

    /**
     * 静态方法.
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T find(T t){
        return t;
    }
}
class GenericTest{
    public static void main(String[] args) {
        GenericDemo d1 = new GenericDemo();
        d1.show("ok");

        Integer n = d1.add(100);
        System.out.println(n);

        System.out.println(GenericDemo.find(3.14));
    }
}
~~~



### 拓展 - 改造反射工厂

~~~java
//没有使用泛型
package tech.aistar.design.factory.generic;

import tech.aistar.day08.relation.extend.Cat;
import tech.aistar.day08.relation.extend.Dog;

/**
 * 本类用来演示:通用的工厂 - 可以用来创建任意对象
 *
 * @author: success
 * @date: 2020/8/6 10:25 上午
 */
public class ObjectFactory {

    public static Object getInstance(String className){
        Object obj = null;

        //1. 获取class实例
        try {
            Class<?> c = Class.forName(className);

            //反射创建类的对象...
            obj = c.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 泛型应用在工厂
     * @param className
     * @param <T>
     * @return
     */
    public static <T> T createInstance(String className){
        T t = null;
        try {
            Class<?> c = Class.forName(className);
            t = (T) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> T createInstance2(T ts){
       T t = null;
       
       Class<?> c = ts.getClass();

        try {
            t = (T) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return t;
    }
}

class TestObjectFactory{
    public static void main(String[] args) {
       // Cat cat = (Cat) ObjectFactory.getInstance("tech.aistar.day08.relation.extend.Cat");

        //Dog dog = (Dog) ObjectFactory.getInstance("tech.aistar.day08.relation.extend.Cat");

        //Dog cat = ObjectFactory.createInstance("tech.aistar.day08.relation.extend.Cat");
        Cat cat = ObjectFactory.createInstance2(new Cat());
    }
}
~~~





## 泛型类派生出来的子类

**泛型类是拥有泛型这个特性的类，它本质上还是一个Java类，那么它就可以被继承**

那它是怎么被继承的呢？？这里分两种情况

1. **子类明确泛型类的类型参数变量**
2. **子类不明确泛型类的类型参数变量**



## 泛型通配符

**?号通配符表示可以匹配任意类型，任意的Java类都可以匹配**.....

现在非常值得注意的是，当我们使用?号通配符的时候：**就只能调对象与类型无关的方法，不能调用对象与类型有关的方法。**



## 设置泛型通配符界限

* <? super Type>

  传递进来的只能是Type或Type的父类

* <? extends Type>

  传进来的只能是Type或者Type的子类



## 泛型擦除

泛型是**提供给javac编译器使用的**，它用于限定集合的输入类型，让编译器在源代码级别上，即挡住向集合中插入非法数据。但编译器编译完带有泛形的java程序后，**生成的class文件中将不再带有泛形信息**，以此使程序运行效率不受到影响，这个过程称之为“擦除”。