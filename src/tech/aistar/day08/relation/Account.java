package tech.aistar.day08.relation;

/**
 * 本类用来演示:银行账户实体类
 *
 * 实体类和业务类要合二为一
 *
 * 实体类中包含了业务方法
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

    /**
     * 存钱
     * @param money
     */
    public void deposite(double money){
        if(money<=0){
            System.out.println("sorry,存入的金额不能是负数!");
            return;
        }
        this.balance += money;
    }

    /**
     * 取钱
     * @param money
     */
    public void withdraw(double money){
        //参数有效性判断
        if(money > this.balance){
            System.out.println("sorry,余额不足!");
            return;
        }
        this.balance-=money;
    }
}
