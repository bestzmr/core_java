package tech.aistar.day13.app;

import tech.aistar.day07.User;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 11:08 上午
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {
    @Override
    public void findUser() {
        System.out.println("findUser...");
    }
}
