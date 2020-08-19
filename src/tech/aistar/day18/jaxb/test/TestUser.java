package tech.aistar.day18.jaxb.test;

import com.sun.javaws.jnl.XMLUtils;
import tech.aistar.day18.jaxb.XmlUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/19 4:33 下午
 */
public class TestUser {
    public static void main(String[] args) {
        User u1 = new User(1,"admin","tom");
        User u2 = new User(2,"java","tom");
        User u3 = new User(3,"php","tom");

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        Users u = new Users();
        u.setUser(users);

        XmlUtils.write(u,"src/tech/aistar/day18/u.xml");
    }
}
