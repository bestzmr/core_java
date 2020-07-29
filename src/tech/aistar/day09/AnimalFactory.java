package tech.aistar.day09;

import tech.aistar.day08.relation.extend.Animal;
import tech.aistar.day08.relation.extend.Cat;

/**
 * 本类用来演示:多态的应用 - 面向父类编程
 *
 * @author: success
 * @date: 2020/7/29 4:17 下午
 */
public class AnimalFactory {
    //面向父类编程3 - 方法的返回类型写成父类,方法的返回值可以是这个父类的任何一个子类对象.
    public static Animal getInstance(){
        return new Cat();
    }
}

class TestF{
    public static void main(String[] args) {

        Animal animal = AnimalFactory.getInstance();
    }
}
