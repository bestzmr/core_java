package tech.aistar.day09.dp.version02;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 2:43 下午
 */
public class TestMiddler {
    public static void main(String[] args) {
        Person person = new Person();

        Middler middler = new Middler();

        //中介找房子
        House house = new House();

        middler.setHouse(house);

        //人找中介
        person.setMiddler(middler);

        person.buy("别墅");
    }
}
