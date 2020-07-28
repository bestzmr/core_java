package tech.aistar.day07;

import tech.aistar.util.DateUtil;

import java.util.Date;

/**
 * @author: Merlin
 * @time: 2020/7/27 15:24
 */
public class UserDemoTest {
    public static void main(String[] args) {
        User[] user = new User[3];
        User user1 = new User(1, "jack", "123", new Date());
        User user2 = new User(2, "james", "456", new Date());
        User user3 = new User(3, "jerry", "12334", new Date());
        user[0] = user1;
        user[1] = user2;
        user[2] = user3;
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }
    }
}
