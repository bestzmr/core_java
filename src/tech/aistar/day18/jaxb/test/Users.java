package tech.aistar.day18.jaxb.test;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/19 4:32 下午
 */
@XmlRootElement
public class Users implements Serializable {

    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
