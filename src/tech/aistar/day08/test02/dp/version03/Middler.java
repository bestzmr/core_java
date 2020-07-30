package tech.aistar.day08.test02.dp.version03;

/**
 * 本类用来演示:中介
 *
 * @author: success
 * @date: 2020/7/29 2:41 下午
 */
public class Middler extends MiddlerSup{

    //中介找房地产公司了

    //中介和房源也解耦合了...
    private HouseSup houseSup;

    public Middler() {
    }

    public Middler(HouseSup houseSup) {
        this.houseSup = houseSup;
    }

    public void find(String name) {
       houseSup.desc(name);
    }
}
