package tech.aistar.day16.practice.synchronizeds;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:25
 */
public class SynAgainDemo {
    public synchronized void test01() {
        System.out.println("test01");
        test02();
    }

    private synchronized void test02() {
        System.out.println("test02");
    }

    public static void main(String[] args) {
        SynAgainDemo againDemo = new SynAgainDemo();
        againDemo.test01();

    }
}
