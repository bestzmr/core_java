package tech.aistar.day16.practice.account;

/**
 * @author: Merlin
 * @time: 2020/8/14 9:05
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

    public void withdraw(double money) {
        this.balance -= money;
    }
}
