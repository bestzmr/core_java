package tech.aistar.day16.numletter;

/**
 * @author: Merlin
 * @time: 2020/8/14 14:44
 */
public class NumLetter2 {
    int count = 0;

    public synchronized void printabc() {
        for (int i = 0; i < 10; i++) {
            if (count != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                System.out.print("abc");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count = 1;
            notifyAll();
        }
    }

    public synchronized void printABC() {
        for (int i = 0; i < 10; i++) {
            if (count != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.print("ABC");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count = 2;
            notifyAll();
        }
    }

    public synchronized void print123() {
        for (int i = 0; i < 10; i++) {
            if (count != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                System.out.print("123");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count = 0;
            notifyAll();
        }
    }
}

class TestNumLetter {
    public static void main(String[] args) {
        NumLetter2 numLetter2 = new NumLetter2();
        Thread t1 = new Thread(() -> {
            numLetter2.printabc();
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            numLetter2.printABC();
        });
        t2.start();
        Thread t3 = new Thread(() -> {
            numLetter2.print123();
        });
        t3.start();
    }
}