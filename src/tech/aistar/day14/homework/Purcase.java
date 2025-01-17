package tech.aistar.day14.homework;

/**
 * 本类用来演示:购买类
 *
 * @author: success
 * @date: 2020/8/11 8:44 上午
 */
public class Purcase {
    private String brand; //品牌
    private String name; //产品名
    private double cost; // 费用

    public Purcase() {
    }

    public Purcase(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Purcase{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
