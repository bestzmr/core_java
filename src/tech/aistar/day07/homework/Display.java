package tech.aistar.day07.homework;

/**
 * 本类用来演示:显示器实体类
 *
 * @author: success
 * @date: 2020/7/28 8:32 上午
 */
public class Display {
    private String type;

    private int size;

    private String brand;

    public Display() {
    }

    public Display(String type, int size, String brand) {
        this.type = type;
        //尺寸数据校验
        setSize(size);
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
//        注：对于显示器尺寸，必需是 17\23\19\25	，其它尺寸都不合格，
//        对于输入不合格的尺寸，统一规定是 17。
        if(size == 17 || size == 23 || size == 19 || size == 25) {
            this.size = size;
            return;
        }
        this.size = 17;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Display{");
        sb.append("type='").append(type).append('\'');
        sb.append(", size=").append(size);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
