package tech.aistar.design.factory.common.test04;

/**
 * 本类用来演示:反射工厂
 *
 * @author: success
 * @date: 2020/8/3 10:51 上午
 */
public class SenderFactory {
    /**
     *
     * @param className 具体某个产品的类的全限定名
     * @return
     */
    public static Sender getInstance(String className){
        //定义一个class实例

        //所有的类被加载到JVM的内存之后,那么每个类都是属于Class类的对象.
        //Class类是可以用来描述类的类.
        Sender sender = null;
        try {
            Class<?> c = Class.forName(className);

            //反射创建对象
            sender = (Sender) c.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return sender;
    }
}
