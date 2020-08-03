package tech.aistar.design.factory.common.mytest3;

/**
 * @author: Merlin
 * @time: 2020/8/3 10:26
 */
public class SenderFactory {
    public static Sender produceQQ() {
        return new QQSender();
    }

    public static Sender produceWx() {
        return new WXSender();
    }


}
