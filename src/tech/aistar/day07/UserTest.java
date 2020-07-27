package tech.aistar.day07;

import tech.aistar.util.DateUtil;

import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/27 10:25 上午
 */
public class UserTest {
    public static void main(String[] args) {
        //1. 创建一个User实例,User对象

        // 栈      堆
        // user -> [id=100]
        User user = new User();//对象是具体的.
        //通过setter方法来对属性进行赋值
        user.setId(100);
        user.setUsername("习大大");

        user.setPassword("abc123");

        user.setRegisterDate(new Date());

        //通过getter方法进行取值.
        System.out.println(user.getId());//100
        System.out.println(user.getUsername());

        System.out.println(user.getPassword());

        String strDate = DateUtil.format(user.getRegisterDate(),"yyyy-MM-dd HH:mm:ss");
        System.out.println(strDate);



        User u1 = new User();
        //栈     堆
        //u1 ->  [id=0]
        System.out.println(u1.getId());//0
    }
}
