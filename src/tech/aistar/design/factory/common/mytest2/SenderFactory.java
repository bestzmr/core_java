package tech.aistar.design.factory.common.mytest2;

/**
 * @author: Merlin
 * @time: 2020/8/3 10:42
 */
public class SenderFactory {
    public Sender produceQQ() {
        return new QQSender();
    }
    public Sender produceWX() {
        return new WXSender();
    }
}
