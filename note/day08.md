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

  