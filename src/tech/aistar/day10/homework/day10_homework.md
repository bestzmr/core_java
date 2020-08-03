~~~java
第一道题
1.定义图书操作业务接口 IBookBiz

有如下方法:
//添加图书
 void add(Book b);
//根据图书name 来删除指定图书
 void deleteByName(String name);
//打印出所有的图书信息
 void outputAllBooks();

2. 定义 数组图书管理业务实现类(ArrayBookBiz) 
实现 IBookBiz接口，
实现所有方法,
提示，给出如下属性
属性:
private static final int CAPACITY = 5;
private int count; //代表有效图书数量
private Book[] books = new Book[CAPACITY];
方法：
  就是实现接口中的所有方法

最后，写测试类，测试这三个方法.

~~~

~~~java
第二道题
设计一个抽象员工类(Emp) ,有一个计算工资的方法如下:
public abstract double calcSalary();

设计如下子类:
1. Boss 类, 拿固定薪资, 每月为50000元.

2. 小时工类(HourEmp), 按每小时15元收费,
每月工资为当月的工作小时数*每小时费用.

3. 全职员工(FullTimeEmp), 
每月基本工资是 3000元,提成方式如下: 
基本提成率是 10% (以基本工资为基础)
	 如果当月超额完成任务的 30%,则按1.5倍 下发提成.
	 如果当月超额完成任务的50%,则按2倍下发提成.
	 如果当月超额完成任务的80%,则按3倍下发提成.
	 
以上每个子类的属性请自己根据业务来设计. 
但并需要重写父类的 calcSalary方法

最后,写一个EmployeeTest类,创建各个具体的员工对象,
并调用calcSalary方法,得到每个员工的工资,并打印出来.
~~~

