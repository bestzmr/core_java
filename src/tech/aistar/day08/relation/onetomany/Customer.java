package tech.aistar.day08.relation.onetomany;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 10:15 上午
 */
public class Customer {
    private int id;

    private String cname;

    //实体类中尽量不要出现char类型
   // private int sex;//1,0

    //双向关联
    private Orders[] orders;

    public Customer() {
    }

    public Customer(int id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Orders[] getOrders() {
        return orders;
    }

    public void setOrders(Orders[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", cname='").append(cname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
