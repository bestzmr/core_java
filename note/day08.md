# 对象关系

简介:对象与对象之间的关系.1:1,1:N,N:N,自关联.

关系具有方向性:

* 单向关联 - **为了减少开发的成本**,优先使用单向关联.
* 双向关联

## One To One

* **单向关联**

  一个A类中维护了另外一个B类的对象,但是另外一个B类中并没维护A类的对象

  并且1:1的俩个对象之间的关系是平等的.

  ~~~java
  public class Husband{
    private int id;
    
    private String name;
    
    //一个丈夫对象对应一个妻子对象
    //一个丈夫对象应该需要维护单个妻子对象
    private Wife wife;
  }
  
  public class Wife{
    private int id;
    
    private String name;
  }
  ~~~

  或者

  ~~~java
  public class Husband{
    private int id;
    
    private String name;
   
  }
  
  public class Wife{
    private int id;
    
    private String name;
    
    //一个妻子中维护了一个丈夫对象
    private Husband husband;
  }
  ~~~

* **双向关联**

  彼此俩个类互相关联.

  ***推荐toString只要打印基本的属性即可,关联的对象无需打印,需要用到的使用调用getter方法,防止出现***
  ***堆栈溢出异常.***

  ~~~java
  public class Husband{
    private int id;
    
    private String name;
    
    //丈夫也维护了妻子
    private Wife wife;
   
  }
  
  public class Wife{
    private int id;
    
    private String name;
    
    //一个妻子中维护了一个丈夫对象
    private Husband husband;
  }
  ~~~

  

## One To Many

简介:一对多

* 单向关联

  ~~~java
  public class Customer{
    private int id;
    
    private String cname;
    
    //一个客户维护多个订单
    private Order[] orders;
  }
  
  public class Order{
    private int id;
    
    private String orderNo;
    
    private double price;
    
  }
  ~~~

  或者

  ~~~java
  public class Customer{
    private int id;
    
    private String cname;
   
  }
  
  public class Order{
    private int id;
    
    private String orderNo;
    
    private double price;
    
    //一个订单对应一个客户.
    private Customer customers;
    
  }
  ~~~

* 双向关联

  ~~~java
  public class Customer{
    private int id;
    
    private String cname;
    
    //一个客户维护多个订单
    private Order[] orders;
  }
  
  public class Order{
    private int id;
    
    private String orderNo;
    
    private double price;
    
    //一个订单对应一个客户.
    private Customer customers;
  }
  ~~~

* Many To Many

  student

  | sid  | sname |      |
  | ---- | ----- | ---- |
  | 1    | tom   |      |
  | 2    | jack  |      |

  course

  | id   | cname  |      |
  | ---- | ------ | ---- |
  | 1    | java   |      |
  | 2    | python |      |

  sc

  | sid  | cid  |
  | ---- | ---- |
  | 1    | 1    |
  | 1    | 2    |
  | 2    | 2    |



# 业务类和实体类

作业中的**Employee类** - 定位的角色 - 实体类(**描述对象**的,现阶段实体类中应该就只包含属性,构造,getter.setter,toString),但是实体类中出现了addEmp等方法,而这些方法都是属于**业务方法**.

应该要遵守软件开发的设计原则(SRP - 单一职责原则 - 不要让一个类的"压力"太多 - 类的任务比较"多")



## 业务类和实体类合二为一

简介:实体类包含了业务方法.

~~~java
package tech.aistar.day08.relation;

/**
 * 本类用来演示:银行账户实体类
 *
 * 实体类和业务类要合二为一
 *
 * 实体类中包含了业务方法
 *
 * @author: success
 * @date: 2020/7/28 10:51 上午
 */
public class Account {
    private int id;

    private double balance;//账户余额

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 存钱
     * @param money
     */
    public void deposite(double money){
        if(money<=0){
            System.out.println("sorry,存入的金额不能是负数!");
            return;
        }
        this.balance += money;
    }

    /**
     * 取钱
     * @param money
     */
    public void withdraw(double money){
        //参数有效性判断
        if(money > this.balance){
            System.out.println("sorry,余额不足!");
            return;
        }
        this.balance-=money;
    }
}

~~~



## 业务类和实体类分开

* 实体类 - 描述对象 - **数据在内存中的载体.**强调的是数据的存储

* 业务类 -  操作对象中的数据的.强调的是数据的操作.

  推荐业务方法放在业务类中.

~~~java
package tech.aistar.day08.relation.biz;

/**
 * 本类用来演示: 银行账户业务类
 *
 * @author: success
 * @date: 2020/7/28 11:01 上午
 */
public class AccountBiz {


    //account ->   600.0d

    //acc
    public void deposite(Account acc,double money){
        if(money<=0){
            System.out.println("sorry,存入的金额不能是负数!");
            return;
        }
        acc.setBalance(acc.getBalance()+money);
    }


    /**
     * 一线城市 - 买不起
     *
     * 取钱
     */
    public void withdraw(Account acc,double money){
        if(acc.getBalance()<money){
            System.out.println("sorry,余额不足!");
            return;
        }
        //acc.setBalance(acc.getBalance()-money);

        double balance = acc.getBalance();
        balance-=money;
        acc.setBalance(balance);
    }
}

~~~



# 作业

* 昨天的作业进行实体类和业务类分离.



# 继承

简介:继承Encapsulation,继承是面向对象语言中最为显著的特点.根据某个已经存在的类来派生出

更多的子类.**子类可以吸收(继承)父类中的非私有成员**.一个类如果没有明确指定它的父类的时候,

那么这个类将会直接继承java.lang.Object.java中的类的继承具有层次性,**单继承(单重继承),**

一个类只能拥有唯一的一个直接的父类,但是一个父类可以拥有多个子类.

使用继承可以提高代码的**复用性**和**可拓展性**,提高程序的开发性能.



## 什么时候使用继承

业务中满足 ***a is b*** 语义的时候才能使用继承.继承不能滥用(不能为了继承而继承,不能为了代码的复用而滥用继承)

 是 水果 - 水果是父类,是子类.

狗 是 动物 - 动物是父类,狗是子类.



我们会将业务中多个对象具有的共同的特征抽离出来形成一个"类别" - 父类,基类,根类.

**父类中存放的是各个子类共同的"特征"以及"行为".**

**子类中可以提供各个子类独有的"特征"以及"行为".**

~~~java
//动物园的管理系统

public class Animal{//动物类
  private String name;
  
  private int age;
}

//Dog类继承Animal类
public class Dog extends Animal{//动物的子类
  
}

//Cat类继承Animal类
public class Cat extends Animal{
  
}
~~~

























