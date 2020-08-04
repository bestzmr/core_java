package tech.aistar.day11;

/**
 * 本类用来演示:拷贝
 *
 * 1 - 原型模式
 * 2 - vo dto bo do ... pojo po
 *
 * @author: success
 * @date: 2020/8/4 8:58 上午
 */
public class CloneDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1,"1001,","java");

        BookInfo info = new BookInfo(1,"这是一本好书");
        b1.setInfo(info);

        try {
            //if(this instanceof Cloneable){
            //    //....
            // }else{
            //    //抛出一个异常...
            // }
            //直接使用java.lang.Object中提供的clone方法 - 浅克隆
            Book b2 = (Book) b1.clone();

            //特点:修改原对象b1,看是否对拷贝出来的副本对象b2造成影响.
            //修改原对象的基本数据类型的时候,没有对副本造成影响 - 基本数据类型和String直接拷贝了一份给副本.
            b1.setId(100);
            b1.setIsbn("1002");

            //修改关联的对象的类型
            b1.getInfo().setRemark("这是坏书!");

            System.out.println(b2);
            System.out.println(b2.getInfo());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
