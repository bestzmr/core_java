package tech.aistar.design.factory.common.mytest;

/**
 * @author: Merlin
 * @time: 2020/8/3 10:26
 */
public class SenderFactory {
    public static final String QQ = "QQ";
    public static final String WX = "WX";

    public Sender getInstance(String string) {
        if (QQ.equals(string)) {
            return new QQSender();
        } else if (WX.equals(string)) {
            return new WXSender();
        } else {
            System.out.println("没有该对象！");
            return null;

        }
    }



}
