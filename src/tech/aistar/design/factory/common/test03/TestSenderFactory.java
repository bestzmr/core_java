package tech.aistar.design.factory.common.test03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 10:33 上午
 */
public class TestSenderFactory {
    public static void main(String[] args) {
        //SenderFactory factory = new SenderFactory();//工厂肯定是重量级的对象.
        Sender qq = SenderFactory.produceQQ();

        Sender wx = SenderFactory.produceWX();
    }
}
