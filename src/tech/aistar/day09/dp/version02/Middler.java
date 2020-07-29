package tech.aistar.day09.dp.version02;

/**
 * 本类用来演示:中介
 *
 * @author: success
 * @date: 2020/7/29 2:41 下午
 */
public class Middler {

    //中介找房源
    private House house;

    public void setHouse(House house) {
        this.house = house;
    }

    public void find(String name){
        house.desc(name);
    }
}
