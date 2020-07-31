package tech.aistar.day10.all;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 3:25 下午
 */
public class PlayerPenImpl implements IPlayer{
    @Override
    public void play(Player player) {
//        //一套业务流程下来..
//        System.out.println("开幕...");
//
//        System.out.println(player.getName()+"演员登场...");
//
//        System.out.println("开始捧哏表演...");
//
//
//        System.out.println("落幕退场...");

        PlayerTemplate t = new PlayerTemplate() {
            @Override
            public void play() {
                System.out.println("开始捧哏表演!!!...");
            }
        };
        t.start(player);
    }
}
