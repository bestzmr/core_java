package tech.aistar.day13.practice.exception.biz;



/**
 * @author: Merlin
 * @time: 2020/8/6 21:20
 */
public class TestAccountBiz {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1);
        account.setBalance(500.00d);
        AccountBiz biz = new AccountBiz();
        try {
            biz.deposite(account, -100.0d);
        } catch (MoneyMustException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance());

    }
}
