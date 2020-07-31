# OO的高级特性

* 抽象类
* 接口



# 抽象类

简介:使用abstract关键字来定义的类 - 抽象类.



* 抽象类是不能够被实例化的.
* 抽象类中可以提供普通属性以及普通方法
* 抽象类中一定存在构造,并且绝对不推荐私有.
* 抽象类天生就是用来被继承的.
* 只有接口和抽象类才有资格去定义**抽象方法**
  * 抽象方法 - 使用abstract修饰的方法,特点:是没有方法体的方法.
  * 抽象方法天生就是用来被子类重写的.

* 抽象类也仅仅支持单继承.
* 抽象类中也是可以定义静态方法的.



# 继承性

* 当一个普通的类去继承一个抽象的父类的时候,那么在编译期间,要求普通子类强制去重写父类中的所有的抽象方法.非抽象方法,子类可以选择性重写或者不重写.
* 当一个抽象的子类去继承一个抽象的父类的时候,那么在编译期间,抽象的子类可以选择性去重写父类中的所有的方法[包括抽象和非抽象].



# 互斥的修饰符

* final和abstract不能同时修饰类.

  final修饰的类是不允许被继承的,但是abstract修饰的抽象类天生就是用来被继承的.

* static和abstract能否同时修饰方法

  static修饰的方法是不能够被重写,static修饰的方法是没有多态的.

  abstract天生就是为了被重写,天生就是为了多态.

* private和abstract能否同时修饰方法

  private私有方法是不能被子类重写的.

* final和abstract是否能够同时修饰方法

  final修饰的方法不能被重写.



# 应用场景

抽象类负责定义业务的结构,让业务的具体的细节延迟到子类中去实现.



## 模板设计模式
