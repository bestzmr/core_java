package tech.aistar.day16.numletter;

/**
 * 本类用来演示: 练习 - a1b2c3...
 * 俩个线程,一个负责输出小写,一个负责输出数字,但是要求是依次循环打印.
 *
 * @author: success
 * @date: 2020/8/14 2:27 下午
 */
public class NumLetter {
    //定义一个标记位
    private boolean flag;

    public synchronized void printLetter(){
        for (char i = 'a'; i <= 'z' ; i++) {
            if(flag){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            notify();
        }

    }

    public synchronized void printNum(){
        for (int i=1; i <=52 ; i+=2) {
            if(flag ==  false){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(i+" "+(i+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = false;
            notify();
        }
    }

    public static void main(String[] args) {
        NumLetter m = new NumLetter();

        //1. 创建一个字母的线程出来
        Thread letter = new Thread(()->{
            m.printLetter();
        });

        //2. 创建一个数字的线程出来
        Thread num = new Thread(()->{
            m.printNum();
        });

        letter.start();
        num.start();
    }
}
