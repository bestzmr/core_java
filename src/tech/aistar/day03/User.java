package tech.aistar.day03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/18 1:42 下午
 */
public class User {

    //非静态成员
    public int id = 1;

    //静态成员 - 初始化了一次
    public static int guid = 100;

    //构造方法
    public User(){
        //System.out.println("User...");
        //id = ++id;
        id = ++guid;

    }

    public static void main(String[] args) {
        //创建一个User对象
        User u1 = new User();
        //非静态 - 对象.成员
        System.out.println(u1.id);//2


        User u2 = new User();
        System.out.println(u2.id);//2



        User u3 = new User();
        System.out.println(u3.id);//2


    }
}
