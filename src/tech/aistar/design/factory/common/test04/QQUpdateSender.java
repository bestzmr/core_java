package tech.aistar.design.factory.common.test04;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 11:13 上午
 */
public class QQUpdateSender extends QQSender implements Sender{
    //合成复用原则代替继承
    public QQUpdateSender(){
        System.out.println("updateQQ...");
    }
}
