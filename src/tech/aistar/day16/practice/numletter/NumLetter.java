package tech.aistar.day16.practice.numletter;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:13
 */
public class NumLetter {
    private boolean flag;
    public synchronized void printLetter() {
        for (char i = 'a'; i < 'z'; i++) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException ee) {
                    ee.printStackTrace();
                }
            }

            System.out.println(i);
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            notify();

        }
    }

    public synchronized void printNum() {
        for (int i = 1; i < 52; i++) {
            if (flag == false) {
                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " " + (i + 1));
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
        Thread letter = new Thread(() ->{
            m.printLetter();

        });
        Thread num = new Thread(() -> {
            m.printNum();
        });
        letter.start();
        num.start();

    }

}
