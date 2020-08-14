package tech.aistar.day16.homework.account;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/14 8:48 上午
 */
public class Account {
    private int id;

    private double balance = 100;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 取钱...
     * @param money
     */
    public void withdraw(double money){
        this.balance-=money;
    }
}
