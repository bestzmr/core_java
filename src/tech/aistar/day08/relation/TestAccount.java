package tech.aistar.day08.relation;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 10:55 上午
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1);
        account.setBalance(100.0d);

        account.deposite(200.0d);

        System.out.println(account.getBalance());

        account.withdraw(50.0d);

        System.out.println(account.getBalance());
    }
}
