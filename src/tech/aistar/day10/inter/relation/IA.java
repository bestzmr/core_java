package tech.aistar.day10.inter.relation;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 2:22 下午
 */
public interface IA {
    void add();

    default void a(){
        System.out.println("a...");
    }
}
