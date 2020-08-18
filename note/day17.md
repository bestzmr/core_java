# 反射
简介:在程序运行期间,通过反射技术来动态获取类的内部信息,获取属性以及调用方法.
换一种方式来构建对象,设置/获取属性,调用方法.反射技术是未来读懂框架技术的源码必备的技术.
***java.lang.Class<T>***它是反射技术的基础类.

# Class
当类加载器将类加载到JVM内存的时候,会把类映射成Class,所有被加载到内存的类,都是属于Class类型的
对象.一个类无论被实例化多少次,它在JVM中的class实例永远只有1个.java.lang.Class<T>是用来描述
类的类.

## 获取Class实例的方式
* 对象.getClass();
* 类名.class;
* Class.forName("类的全限定名");//需要抛出一个异常java.lang.ClassNotFoundException
* 基本类型.class;
  ~~~java
  System.out.println(int.class);//int
  ~~~



## 反射相关API

* Field[] getFields();//获取类中所有的公共的属性.
* Field[] getDeclaredFields();//获取类中所有的属性,包括私有的.
* Field getField(String fieldName);//根据属性的名称来获取这个属性对应的Field对象.但是也是公开的.
* Field getDeclaredField(String fieldName);//根据属性的名称来获取这个属性对应的Field对象,但是包括私有的属性.
* String getName();//获取类的全限定名
* String getSimpleName();//获取类的简称.



# Field

***java.lang.reflect***.Field

反射获取类内部的字段(属性)的元信息.元信息包括:***属性的修饰符,属性的数据类型,属性的名称***,属性的值.



常用方法:

* int getModifiers();//属性的修饰符.
* Class<?> getType();//反射获取类型
* String getName();//获取属性的名称



# 反射在框架中的应用

~~~java
public interface IUserDao{
  
}
//dao层 - 专门和DB交互[jdbc技术,mybatis技术.].
public class UserDaoImpl implements IUserDao{
    //CRUD操作.
}

public interface IUserSerivce{
  
}

//业务逻辑层 - 进行数据统计,数据归来,数据分析,数据处理.
//业务逻辑层首先调用dao层.
public class UserServiceImpl implements IUserService{
    //需要维护一个dao对象
    //传统的写法 -
    //弊端 - 突然哪天实现类换掉了.代码是需要重新编译的.
    //谁使用组件,还必须需要程序自己去创建组件.
    //将对象的创建和对象的使用耦合在一块儿.
    //主动寻找方式 - 哪里使用,哪里new
    //private IUserDao userDao = new UserDaoImpl();
    
    //使用了spring框架之后,被动接受组件.
  	private IUserDao userDao;
  
    
}
~~~

spring框架属于IOC容器 - 控制反转 - 将bean的生命周期[创建]的权利交给了spring框架.

降低各个组件之间的耦合性.

~~~xml
俩个bean - 俩个组件.
等同于反射创建了一个UserDaoImpl对象.
<bean id="userDao" class="tech.aistar.dao.UserDaoImpl">

</bean>

<bean id="userDao2" class="tech.aistar.dao.UserDaoImpl2">

</bean>

反射创建了UserServiceImpl对象.
<bean id="userService" class="tech.aistar.service.UserServiceImpl">
	  <property name="userDao" ref="userDao2"/>
</bean>
~~~



