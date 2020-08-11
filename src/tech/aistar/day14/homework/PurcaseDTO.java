package tech.aistar.day14.homework;

/**
 * 本类用来演示:封装统计之后的结果的实体类
 *
 * @author: success
 * @date: 2020/8/11 9:07 上午
 */
public class PurcaseDTO {
    private String brand;

    private double total;

    public PurcaseDTO(String brand, double total) {
        this.brand = brand;
        this.total = total;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurcaseDTO{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
}
