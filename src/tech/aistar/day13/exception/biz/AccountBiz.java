package tech.aistar.day13.exception.biz;

/**
 * 本类用来演示: 银行账户业务类
 *
 * @author: success
 * @date: 2020/7/28 11:01 上午
 */
public class AccountBiz {


    //account ->   600.0d

    //acc
    public void deposite(Account acc, double money) throws MoneyMustException {
        if(money<=0){
            //System.out.println("sorry,存入的金额不能是负数!");
           // throw new RuntimeException("sorry,存入的金额不能是负数!");
           // return;

            throw new MoneyMustException("sorry,金额不能小于0!");
        }
        acc.setBalance(acc.getBalance()+money);
    }


    /**
     * 一线城市 - 买不起
     *
     * 取钱
     */
    public void withdraw(Account acc, double money){
        if(acc.getBalance()<money){
            System.out.println("sorry,余额不足!");
            return;
        }
        //acc.setBalance(acc.getBalance()-money);

        double balance = acc.getBalance();
        balance-=money;
        acc.setBalance(balance);
    }
}
