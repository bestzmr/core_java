package tech.aistar.day07.homework;

/**
 * 本类用来演示:电脑计算机实体类entity
 *
 * @author: success
 * @date: 2020/7/28 8:31 上午
 */
public class Computer {
    //private int id;//以后实体类都会拥有一个唯一标识
    private String brand;

    private double price;

    private String description;//描述

    //一个电脑对应一个显示器
    //Computer类关联了单个Display的对象.
    private Display display;

    public Computer() {
    }

    public Computer(String brand, double price, String description, Display display) {
        this.brand = brand;
        //this.price = price;

        //构造方法中进行数据的校验 - 推荐调用setter方法
        setPrice(price);

        this.description = description;
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
//        针对 价格，不能低于1000, 也不能超过20000;
//        对于超出这个值的，给一个默认值：2000
        if(price<1000 || price>20000)
            price = 2000;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append('\'');
        sb.append(", display=").append(display);
        sb.append('}');
        return sb.toString();
    }
}
