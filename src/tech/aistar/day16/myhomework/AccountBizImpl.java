package tech.aistar.day16.myhomework;

/**
 * @author: Merlin
 * @time: 2020/8/13 17:44
 */

/**
 * AccountBiz类 - 模拟取钱,每次只能取10元钱.
 * <p>
 * 开启俩个线程老公,小三 -> 同时取钱,保证线程的同步.
 * <p>
 * 老公取钱,剩余90元.
 * <p>
 * 小三取钱,剩余80元.
 */
public class AccountBizImpl implements AccountBiz {
    private Account account;

    public AccountBizImpl(Account account) {
        this.account = account;
    }

    @Override
    public synchronized void withdrawMoney() {
        double balance = account.getBalance();
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.setBalance(balance - 10.0d);
    }

    @Override
    public void run() {
        withdrawMoney();
    }
}
