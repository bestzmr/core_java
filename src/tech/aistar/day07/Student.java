package tech.aistar.day07;

/**
 * 本类用来演示:学生-实体类
 *
 * 类是一个抽象的概念,类是构建对象的蓝图或者模板.
 * 对象是具体的.
 *
 * id    name - 表中列 -> 类中的属性.
 * 1     tom          -> 类实例化出来的对象
 *
 *
 * @author: success
 * @date: 2020/7/27 9:46 上午
 */
public class Student {
    //类里面可以定义对象的属性 - 对象拥有什么
    //语法: 修饰符 数据类型 属性名 [=初始值];

    //没有封装之前 - 所有的属性都是直接暴露给外界的.外界是允许直接操作[访问和修改]属性的.

    //a. 属性属于全局变量
    //b. 没有static修饰的属性 - 实例变量 - 对象变量 - 变量是属于对象.

    //基本类型
   // public int id = 1;

    public int id;

    //定义一个姓名
    //对象类型
    //public String name = "tom";
    public String name;

    //public String[] hobbies = {"打游戏","敲代码"};
    public String[] hobbies;

    //对象与对象之间是有关系的
    //假设 - 一个学生只能属于一个班级
    public Clazz clazz;//默认值是null

}
