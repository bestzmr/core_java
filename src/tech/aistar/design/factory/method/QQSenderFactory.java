package tech.aistar.design.factory.method;

/**
 * 本类用来演示:一个具体的产品对应一个具体的这个产品的工厂.
 *
 * @author: success
 * @date: 2020/8/3 2:07 下午
 */
public class QQSenderFactory implements SenderFactoryable{
    @Override
    public Sender produce() {
        return new QQSender();
    }
}
