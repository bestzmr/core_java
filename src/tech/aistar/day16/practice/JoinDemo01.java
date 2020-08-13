package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 15:37
 */
public class JoinDemo01 {
    public static void main(String[] args) {

    }
}
class FatherThread extends Thread{
    @Override
    public void run() {
        System.out.println("BaBa正在烧饭。。");
        System.out.println("发现酱油没有了。。");
        Thread son = new SonThread();
        son.start();
        try {
            son.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("BaBa继续做饭！");
    }
}

class SonThread extends Thread {
    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("熊孩子出去打酱油了，还有" + i + "分钟回来了~");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("熊孩子酱油打回来了!!!");

        }
    }
}