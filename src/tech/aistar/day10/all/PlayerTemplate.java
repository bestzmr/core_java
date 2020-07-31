package tech.aistar.day10.all;

/**
 * 本类用来演示:模板
 *
 * @author: success
 * @date: 2020/7/31 3:31 下午
 */
public abstract class PlayerTemplate {

    public void test01(){
        System.out.println("开幕...");
    }

//    System.out.println("开幕...");
//
//        System.out.println(player.getName()+"演员登场...");
//
//        System.out.println("开始捧哏表演...");
//
//
//        System.out.println("落幕退场...");
    public void test02(Player player){
        System.out.println(player.getName()+"演员登场...");
    }

    public void test03(){
        //每个子类的实现都不一样的,延迟到子类中去实现
        play();
    }

    public abstract void play();

    public void test04(){
        System.out.println("落幕退场...");
    }

    //提供一个执行固定的业务流程的方法.
    public final void start(Player player){
        test01();

        test02(player);

        test03();

        test04();
    }
}
