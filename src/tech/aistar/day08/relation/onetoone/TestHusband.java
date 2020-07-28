package tech.aistar.day08.relation.onetoone;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 10:03 上午
 */
public class TestHusband {
    public static void main(String[] args) {
        Husband husband = new Husband(1,"肖战",null);

        Wife wife = new Wife(2,"小霞",null);

        //应该做的双向关联 - 所以需要双向绑定.
        husband.setWife(wife);
        wife.setHusband(husband);

        System.out.println(husband);
        System.out.println(husband.getWife());

    }
}
