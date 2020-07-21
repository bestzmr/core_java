package tech.aistar.day03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/18 3:05 下午
 */
public class User {
    //Oo - 类是抽象的,对象是具体的.
    private int id = 100;

    //对象是共享静态变量的.
    private static int guid = 100;

    //构造方法 - 空参
    public User(){
        //guid = guid++;
        id = ++guid;
    }

    public static void main(String[] args) {
        User u1 = new User();//guid = guid++ = 100
        System.out.println(User.guid+"===");
        System.out.println(u1.id);
        User u2 = new User();
        System.out.println(User.guid+"===");//guid=100
        System.out.println(u2.id);
        User u3 = new User();
        System.out.println(User.guid+"===");
        System.out.println(u3.id);
    }
}
