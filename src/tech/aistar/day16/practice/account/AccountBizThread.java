package tech.aistar.day16.practice.account;

/**
 * @author: Merlin
 * @time: 2020/8/14 9:39
 */
public class AccountBizThread implements Runnable{
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            if (account.getBalance() > 0) {
                test(10);
            }
        }
    }

    public void test(double money) {
        synchronized (account) {
            if (account.getBalance() > 0) {
                System.out.println(Thread.currentThread().getName() + "->正在取钱");
                account.withdraw(money);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "->余额还剩：" + account.getBalance());

            }
        }
    }

    public static void main(String[] args) {
        Runnable r = new AccountBizThread();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("婆娘");
        t2.setName("官人");

        t1.start();
        t2.start();
    }
}
