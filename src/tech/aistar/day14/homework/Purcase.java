package tech.aistar.day14.homework;

import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/10 16:27
 */
public class Purcase {
    private String brand; //品牌
    private String name; //产品名
    private double cost; // 费用

    public Purcase() {
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


    public Purcase(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }

    public static void main(String[] args) {
        List<Purcase> list = new ArrayList<>();
        Purcase p1 = new Purcase("宝洁","洗手粉",18.5);
        Purcase p2 = new Purcase("联合利华","肥皂",4.5);
        Purcase p3 = new Purcase("宝洁","牙膏",32.5);
        Purcase p4 = new Purcase("宝洁","毛巾",14.5);
        Purcase p5 = new Purcase("洁利","洗面奶",26.0);
        Purcase p6 = new Purcase("好迪","洗发水",27.5);
        Purcase p7 = new Purcase("多芬","沐浴露",38.5);
        Purcase p8 = new Purcase("宝洁","洗洁精",3.4);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);

        Map<String, Double> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Purcase purcase = list.get(i);
            if (map.get(purcase.getBrand()) == null) {
                map.put(purcase.getBrand(), purcase.getCost());
            } else {
                double tmp = map.get(purcase.getBrand());
                map.put(purcase.getBrand(), tmp + purcase.getCost());
            }
        }
        Set<Map.Entry<String, Double>> set = map.entrySet();
        set.stream().sorted(((o1, o2) -> o2.getValue().compareTo(o1.getValue()))).forEach(x-> System.out.println(x.getKey()+":"+x.getValue()));
    }
}
