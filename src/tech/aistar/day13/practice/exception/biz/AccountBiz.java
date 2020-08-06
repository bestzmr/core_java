package tech.aistar.day13.practice.exception.biz;

/**
 * @author: Merlin
 * @time: 2020/8/6 21:14
 */
public class AccountBiz {
    public void deposite(Account account,double money)throws MoneyMustException {
        if (money <= 0) {
            throw new MoneyMustException("sorry 金额不能小于0");
        }
        account.setBalance(account.getBalance() + money);
    }

    public void withdraw(Account account, double money) {
        if (account.getBalance() < money) {
            System.out.println("sorry,余额不足");
            return;
        }
        double balance = account.getBalance();
        balance -= money;
        account.setBalance(balance);

    }
}
