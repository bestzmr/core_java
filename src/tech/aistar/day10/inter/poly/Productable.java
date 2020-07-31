package tech.aistar.day10.inter.poly;

import tech.aistar.day10.inter.relation.Cimpl;
import tech.aistar.day10.inter.relation.IA;
import tech.aistar.day10.inter.relation.IC;
import tech.aistar.day10.inter.relation.ID;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 2:45 下午
 */
public interface Productable {
    //方法的参数是接口,那么可以传入这个接口的任何一个实现类对象.
    void test(IC ic);

    void test02(ID id);
}
class ProductableImpl implements Productable{

    @Override
    public void test(IC ic) {
        ic.add();
    }

    @Override
    public void test02(ID id) {

    }
}
class TestProduct{
    public static void main(String[] args) {
        Productable productable = new ProductableImpl();
        IC ic = new Cimpl();

        productable.test(ic);

        System.out.println("====");

        //使用匿名内部类
        ID id = new ID() {
            @Override
            public void d() {
                System.out.println("d...");
            }
        };
        id.d();
    }
}