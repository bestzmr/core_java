package tech.aistar.design.factory.common.test04;

/**
 * 本类用来演示:反射创建对象
 *
 * @author: success
 * @date: 2020/8/3 10:47 上午
 */
public class ClassNewDemo {
    public static void main(String[] args) {
        //1. 获取类的class实例
        try {
            Class<?> c = Class.forName("tech.aistar.design.factory.common.test04.QQSender");

            //2. 反射创建对象
            Sender qq = (Sender) c.newInstance();

        } catch (ClassNotFoundException e) {//类的全限定名不能写错
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
