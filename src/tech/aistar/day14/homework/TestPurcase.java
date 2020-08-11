package tech.aistar.day14.homework;

import tech.aistar.day13.EntryDemo;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/11 8:44 上午
 */
public class TestPurcase {
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

        countSort2(list);
    }

    /**
     * 第一种方式 - 创建第三方实体类
     * 充分体现了实体类就是数据在内存中的载体.
     * 实体类创建出来的对象本身就是特殊的"容器"
     * @param list
     */
    private static void countSort(List<Purcase> list) {
        //1 - 统计品牌名和总价
        //key - 品牌名
        //value - 该品牌对应的Purcase集合
        Map<String,List<Purcase>> maps = new HashMap<>();

        //2. 遍历list集合.进行统计的工作
        for (Purcase p : list) {

            //第一次进来...
            String brand = p.getBrand();

            //判断maps是否包含当前的key.
            if(maps.containsKey(brand)){
                //根据key获取之前的value
                List<Purcase> purcases = maps.get(brand);
                purcases.add(p);
               // maps.put(brand,purcases);//不需要的...
            }else{
                //每次都是遇到一个新的品牌名....
                //创建一个集合
                List<Purcase> lists = new ArrayList<>();
                //把当前的p放入到lists集合中去
                lists.add(p);
                //放入到maps集合中

                //map集合的特征针对key无序不可重复
                //如果后面放入到key和之前的是一样的,那么就会后面的value会覆盖前面的value.
                //拓展:Set集合特点是无序不可重复.拒绝加入
                maps.put(brand,lists);
            }
        }
        //到此,已经完成了分类的工作了...
//        maps.forEach(new BiConsumer<String, List<Purcase>>() {
//            @Override
//            public void accept(String s, List<Purcase> purcases) {
//                System.out.println(s);
//                System.out.println(purcases);
//            }
//        });

        //遍历Purcase集合了吧
        //brand以及价格.
        Map<String,Double> countMap = new HashMap<>();
        //遍历maps集合 - 归类之后的集合对象

        //map集合迭代方式 - 传统的俩种必须要脱手写.
        Set<String> sets = maps.keySet();//将Maps集合中的所有的key全部放入到set集合中.
        //set集合也是可以通过迭代器进行迭代的.
        Iterator<String> iter = sets.iterator();
        while(iter.hasNext()){
            String key = iter.next();//key就是brand
            //获取该品牌对应的集合对象
            List<Purcase> purs = maps.get(key);
            //定义一个变量,用来保存这个品牌的总价
            double total = 0.0d;

            for (Purcase pur : purs) {
                total+=pur.getCost();
            }
            countMap.put(key,total);
        }

        //进行排序...
        //第一种方式通用的方式
        //排序的集合...
        List<PurcaseDTO> dtos = new ArrayList<>();
//        PurcaseDTO dto1 = new PurcaseDTO("宝洁",70.3);

        //遍历countMap集合
//        countMap.forEach(new BiConsumer<String, Double>() {
////            @Override
////            public void accept(String s, Double aDouble) {
////
////            }
////        });

        countMap.forEach((brand,total)->{
            dtos.add(new PurcaseDTO(brand,total));
        });

        //对dtos进行排序
//        dtos.sort((p1,p2)->{
//            return (int) (p2.getTotal() - p1.getTotal());
//        });
//
////        dtos.forEach(System.out::println);
//       dtos.forEach(e->{
//           System.out.println(e.getBrand()+":"+e.getTotal());
//       });

        //链式编程...
        //java.util.Stream[I]
        dtos.stream().sorted((p1,p2)->{
            return (int) (p2.getTotal() - p1.getTotal());
        }).forEach(e->{
            System.out.println(e.getBrand()+":"+e.getTotal());
        });
    }

    /**
     * 直接使用entry对象
     * @param list
     */
    private static void countSort2(List<Purcase> list) {
        //1 - 统计品牌名和总价
        //key - 品牌名
        //value - 该品牌对应的Purcase集合
        Map<String,List<Purcase>> maps = new HashMap<>();

        //2. 遍历list集合.进行统计的工作
        for (Purcase p : list) {

            //第一次进来...
            String brand = p.getBrand();

            //判断maps是否包含当前的key.
            if(maps.containsKey(brand)){
                //根据key获取之前的value
                List<Purcase> purcases = maps.get(brand);
                purcases.add(p);
                // maps.put(brand,purcases);//不需要的...
            }else{
                //每次都是遇到一个新的品牌名....
                //创建一个集合
                List<Purcase> lists = new ArrayList<>();
                //把当前的p放入到lists集合中去
                lists.add(p);
                //放入到maps集合中

                //map集合的特征针对key无序不可重复
                //如果后面放入到key和之前的是一样的,那么就会后面的value会覆盖前面的value.
                //拓展:Set集合特点是无序不可重复.拒绝加入
                maps.put(brand,lists);
            }
        }
        //到此,已经完成了分类的工作了...
//        maps.forEach(new BiConsumer<String, List<Purcase>>() {
//            @Override
//            public void accept(String s, List<Purcase> purcases) {
//                System.out.println(s);
//                System.out.println(purcases);
//            }
//        });

        //遍历Purcase集合了吧
        //brand以及价格.
        Map<String,Double> countMap = new HashMap<>();
        //遍历maps集合 - 归类之后的集合对象

        //map集合迭代方式 - 传统的俩种必须要脱手写.
        Set<String> sets = maps.keySet();//将Maps集合中的所有的key全部放入到set集合中.
        //set集合也是可以通过迭代器进行迭代的.
        Iterator<String> iter = sets.iterator();
        while(iter.hasNext()){
            String key = iter.next();//key就是brand
            //获取该品牌对应的集合对象
            List<Purcase> purs = maps.get(key);
            //定义一个变量,用来保存这个品牌的总价
            double total = 0.0d;

            for (Purcase pur : purs) {
                total+=pur.getCost();
            }
            countMap.put(key,total);
        }

        //map集合的第二种迭代方式
        //将map集合的key和value封装到一个内置的Entry对象,并且这每个entry对象放入到Set中.
        Set<Map.Entry<String,Double>> countSets = countMap.entrySet();
        //思考set集合是不允许进行排序操作的.

        //可以利用一个已经存在的集合来构建另外一个集合
        List<Map.Entry<String,Double>> entrys = new ArrayList<>(countSets);

//        List<Map.Entry<String,Double>> entrys = new ArrayList<>();
//        Iterator<Map.Entry<String,Double>> iters = countSets.iterator();
//        while(iters.hasNext()){
//            Map.Entry<String,Double> entry = iters.next();
//            entrys.add(entry);
//        }

        entrys.sort((e1,e2)->{
            return (int) (e2.getValue() - e1.getValue());
        });

        entrys.forEach(e->{
            System.out.println(e.getKey()+"->"+e.getValue());
        });

       // System.out.println(entrys);

    }
}
