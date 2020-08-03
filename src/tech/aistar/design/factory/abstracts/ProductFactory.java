package tech.aistar.design.factory.abstracts;

/**
 * 本类用来演示:负责创建多个产品族中的多个产品
 *
 * @author: success
 * @date: 2020/8/3 2:18 下午
 */
public interface ProductFactory {//抽象工厂
    Sender produceSender();

    Caller produceCaller();
}
