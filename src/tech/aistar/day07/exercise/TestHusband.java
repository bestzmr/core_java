package tech.aistar.day07.exercise;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/27 3:39 下午
 */
public class TestHusband {
    public static void main(String[] args) {
        //1. 创建一个Husband
        Husband husband = new Husband();
        husband.setId(1);
        husband.setName("鹿晗");

        //准备一个妻子对象
        Wife wife = new Wife();
        wife.setId(1);
        wife.setName("孙霞");

        //将妻子对象绑定到husband对象的wife属性
        husband.setWife(wife);



        //设置husband的妾
        Concubine[] qies = new Concubine[2];
        //创建俩个妾的对象
        Concubine c1 = new Concubine(1,"凤姐");
        Concubine c2 = new Concubine(2,"芙蓉");

        qies[0] = c1;
        qies[1] = c2;

        //设置妾的值
        husband.setConcubine(qies);

        System.out.println(husband);


    }
}
