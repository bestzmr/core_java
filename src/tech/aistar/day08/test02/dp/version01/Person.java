package tech.aistar.day08.test02.dp.version01;

/**
 * 本类用来演示:人 直接  和  房源  产生交互
 *
 * 不符合 迪米特原则 - 最少知道原则.
 *
 * @author: success
 * @date: 2020/7/29 2:33 下午
 */
public class Person {
    //一旦House更改,需要更改Person类

    //Person类和House产生了强耦合的关系
    //房子 -> 别墅 -> 需要修改person类
    //也不符合"开闭原则"
    private House house;

    //找房...
    public void setHouse(House house) {
        this.house = house;
    }

    public void buy(){
        house.desc();
    }
}
