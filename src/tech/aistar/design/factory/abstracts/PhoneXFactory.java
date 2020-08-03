package tech.aistar.design.factory.abstracts;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 2:19 下午
 */
public class PhoneXFactory implements ProductFactory{
    @Override
    public Sender produceSender() {
        return new QQSender();
    }

    @Override
    public Caller produceCaller() {
        return new DingCaller();
    }
}
