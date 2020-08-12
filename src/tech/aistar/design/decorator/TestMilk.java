package tech.aistar.design.decorator;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/12 2:35 下午
 */
public class TestMilk {
    public static void main(String[] args) {
        //1. 使用本身的核心类 - "FileInputStream" - 直接使用的
        MilkTea milkTea = new NaiTea();
        System.out.println(milkTea.getPrice()+"->"+milkTea.getType());

        //2. 使用含有配料的奶茶 - "包装流" - ObjectInputStream/BufferedInputStream
        //构建一个"包装流"必须要以"节点流"作为支撑
        BuDingTea buDingTea = new BuDingTea(new NaiTea());
        System.out.println(buDingTea.getPrice()+"->"+buDingTea.getType());

        //3. 任意进行组装[包装流和节点进行任意组装 - 组成一个功能更加强大的流]
        WuLongTea wuLongTea = new WuLongTea(new NaiTea());
        System.out.println(wuLongTea.getPrice()+"->"+wuLongTea.getType());

        WuLongTea wuLongTea1 = new WuLongTea(new BuDingTea(new NaiTea()));
    }
}
