package tech.aistar.design.decorator;

/**
 * 本类用来演示: 顶级的接口
 *
 * @author: success
 * @date: 2020/8/12 2:22 下午
 */
public interface MilkTea {
    /**
     * 获取价格
     * @return
     */
    double getPrice();

    /**
     * 获取奶茶的种类的名称.
     * @return
     */
    String getType();

}
