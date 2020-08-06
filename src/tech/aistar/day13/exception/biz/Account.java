package tech.aistar.day13.exception.biz;

/**
 * 本类用来演示:银行账户实体类
 *
 * 实体类和业务类要分离
 *
 * @author: success
 * @date: 2020/7/28 10:51 上午
 */
public class Account {
    private int id;

    private double balance;//账户余额

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
}
