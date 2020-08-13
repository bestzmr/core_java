package tech.aistar.day16.myhomework;

/**
 * @author: Merlin
 * @time: 2020/8/13 17:52
 */
public class TestAccount {


    public static void main(String[] args) {
        Account account = new Account(1, "老公");//创建账户
        AccountBiz accountBiz = new AccountBizImpl(account);
        Thread t1 = new Thread(accountBiz);//模拟老公取款
        Thread t2 = new Thread(accountBiz);//模拟小三取款
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);//等待取钱操作之后进行打印操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getBalance());
    }

}

