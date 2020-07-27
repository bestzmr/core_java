package tech.aistar.day07;

/**
 * 本类用来演示:对象数组
 *
 * @author: success
 * @date: 2020/7/27 3:30 下午
 */
public class TsetUserArrayDemo {
    public static void main(String[] args) {
        //创建一个User数组 , 长度3个
        User[] users = new User[3];

        //创建user对象
        User u1 = new User(1,"admin");
        User u2 = new User(2,"tom");
        User u3 = new User(3,"james");

        //放入到数组中去
        users[0] = u1;
        users[1] = u2;
        users[2] = u3;

        //遍历数组
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }

        System.out.println("====");

        //增强for循环
        /*

            for(数据类型 变量:数组对象){
            }

         */
        for(User u:users){
            System.out.println(u);
        }
    }
}
