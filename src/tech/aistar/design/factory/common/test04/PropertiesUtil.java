package tech.aistar.design.factory.common.test04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 本类用来演示:读取属性文件
 *
 * @author: success
 * @date: 2020/8/3 11:04 上午
 */
public class PropertiesUtil {
    private static Properties prop = new Properties();

    //通过静态代码块来读取资源配置文件
    static {
        //准备文件的字节输入流
        InputStream in = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("tech/aistar/design/factory/common/test04/product.properties");

        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key){
        return prop.getProperty(key);
    }

   /* public static void main(String[] args) {
        System.out.println(getValue("QQ"));
    }*/
}
