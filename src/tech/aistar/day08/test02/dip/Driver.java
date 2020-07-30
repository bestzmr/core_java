package tech.aistar.day08.test02.dip;

/**
 * 本类用来演示:司机类 - 汽车类
 *
 * 软件设计原则 - 高内聚,低耦合.
 *
 * 高内聚 - 每个模块单独完成业务的能力比较高.
 *
 * 低耦合 - 模块与模块之间的依赖要低.
 *
 *
 * @author: success
 * @date: 2020/7/29 9:59 上午
 */
public class Driver {

    //司机类中依赖具体的某个汽车....


    //司机类已经和奥迪类产生了高耦合
    //司机类是依赖于各个汽车类
//    public void driverAoDiRun(AoDi aodi){
//        aodi.run();
//    }
//
//    public void driverBaoMa(BaoMa baoMa){
//        baoMa.run();
//    }

    //当掌握了一项新的技能的时候,需要修改司机类
    //当交通工具汽车,飞机一旦新增,居然需要修改司机类.

    //说明司机类和各个车类产生了强耦合的关系.
    //不符合 "开闭原则","高内聚,低耦合"

    //根据依赖倒置原则,依赖于抽象而不依赖于具体.
    public void driverCar(CarSup carSup){
        carSup.run();
    }
}
