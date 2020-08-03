package tech.aistar.design.factory.common.test02;

/**
 * 多方法简单工厂 - 每个产品对应一个创建方法
 *
 * 当新增一个产品的时候,还是动工厂类 - 不符合"开闭原则"
 *
 *
 * @author: success
 * @date: 2020/8/3 9:58 上午
 */
public class SenderFactory {

    public Sender produceQQ(){
        return new QQSender();
    }

    public Sender produceWX(){
        return new WXSender();
    }
}
