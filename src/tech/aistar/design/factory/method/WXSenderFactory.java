package tech.aistar.design.factory.method;

/**
 * 本类用来演示:每次新增一个产品的时候
 * 就让这个产品的工厂实现顶级的工厂接口.
 *
 * 符合"开闭原则"以及"单一职责原则"[把各个产品交给不同的各个工厂去生产]
 *
 * 缺点:会产生大量的顶级的工厂接口的实现类
 *
 * @author: success
 * @date: 2020/8/3 2:08 下午
 */
public class WXSenderFactory implements SenderFactoryable{
    @Override
    public Sender produce() {
        return new WXSender();
    }
}
