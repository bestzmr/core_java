package tech.aistar.day09.dp.version03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 2:43 下午
 */
public class TestMiddler {
    public static void main(String[] args) {
        Person person = new Person();

        HouseSup houseSup = new HouseMaoCaoWu();//房地产公司实例化一个房源出来....

        MiddlerSup middlerSup = new Middler(houseSup);//中介公司委托中介

         //中介找到房源了...

        person.setMiddlerSup(middlerSup);

        person.buy("mm");
    }
}
