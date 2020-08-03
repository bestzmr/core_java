package tech.aistar.design.factory.common.test04;

import java.util.Properties;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 10:55 上午
 */
public class TestSenderFactory {
    public static void main(String[] args) {
        //Sender wx = SenderFactory.getInstance("tech.aistar.design.factory.common.test04.SMSender");
       // Sender wx = SenderFactory.getInstance(ISenderFactoryConsts.WX);

        Sender qq = SenderFactory.getInstance(PropertiesUtil.getValue(ISenderFactoryConsts.QQ));
    }
}
