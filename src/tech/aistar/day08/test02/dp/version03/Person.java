package tech.aistar.day08.test02.dp.version03;

/**
 * 本类用来演示:人 直接  和  房源  产生交互
 *
 * 不符合 迪米特原则 - 最少知道原则.
 *
 * @author: success
 * @date: 2020/7/29 2:33 下午
 */
public class Person {

    //1. 为了降低人和中介之间的耦合
    //人 应该 和 中介公司进行交互了.

    private MiddlerSup middlerSup;

    public void setMiddlerSup(MiddlerSup middlerSup) {
        this.middlerSup = middlerSup;
    }

    public void buy(String name){
        //通过中介购买
        middlerSup.find(name);
    }
}
