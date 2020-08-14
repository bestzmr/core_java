package tech.aistar.day16.homework.account;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/14 8:49 上午
 */
public class AccountBizThread implements Runnable{

    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 10; i > 1 ; i--) {
            if(account.getBalance()>0){
                test(10);
            }

        }
    }

    public void test(double money){

            synchronized (account) {//对象锁.
                if (account.getBalance() > 0) {
                    System.out.println(Thread.currentThread().getName() + "->正在取钱");

                    //调用取钱的方法
                    account.withdraw(money);
                    try {
                        //嘚瑟 - 为了看其他线程是否能够进入..
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "->余额还剩:" + account.getBalance());
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
