package tech.aistar.design.factory.abstracts;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 2:20 下午
 */
public class PhoneXSFactory implements ProductFactory{
    @Override
    public Sender produceSender() {
        return new WXSender();
    }

    @Override
    public Caller produceCaller() {
        return new TengCaller();
    }
}
