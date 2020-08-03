package tech.aistar.design.factory.method;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 2:10 下午
 */
public class TestSenderFactory {
    public static void main(String[] args) {
        //创建一个QQ的工厂
        SenderFactoryable s1 = new QQSenderFactory();
        Sender qq = s1.produce();

        SenderFactoryable s2 = new WXSenderFactory();
        Sender wx = s2.produce();
    }
}
