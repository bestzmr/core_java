package tech.aistar.day17.practice.anno;

/**
 * @author: Merlin
 * @time: 2020/8/18 20:59
 */
@MyAnno({"java", "python"})

public class TestMyAnno {
    @MyAnno({"java2", "python2"})
    public void test() {
        System.out.println("test.....");

    }
}
