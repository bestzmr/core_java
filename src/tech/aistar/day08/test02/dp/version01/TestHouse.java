package tech.aistar.day08.test02.dp.version01;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 2:37 下午
 */
public class TestHouse {
    public static void main(String[] args) {
        //1. 创建一个人的对象
        Person person = new Person();

        //2. 创建一个房源的对象
        House house = new House();

        //3. 人买房
        person.setHouse(house);

        person.buy();
    }
}
