package tech.aistar.day10.all;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 3:28 下午
 */
public class TestPlayer {
    public static void main(String[] args) {
        //创建两个相声演员的对象
        Player yueyue = new DouGen();
        yueyue.setName("岳岳");

        Player ys = new PenGen();
        ys.setName("孙悦");

        //创建接口对象
        IPlayer p1 = new PlayerDouImpl();


        p1.play(yueyue);

        System.out.println("=====");
        IPlayer p2 = new PlayerPenImpl();
        p2.play(ys);



    }
}
