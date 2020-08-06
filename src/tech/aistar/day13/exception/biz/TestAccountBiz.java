package tech.aistar.day13.exception.biz;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 11:06 上午
 */
public class TestAccountBiz {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1);
        account.setBalance(500.0d);

        //创建业务类对象
        AccountBiz biz = new AccountBiz();
        try {
            biz.deposite(account,-100.0d);
        } catch (MoneyMustException e) {
            e.printStackTrace();
        }

        System.out.println(account.getBalance());
    }
}
