package tech.aistar.day13.app;

import tech.aistar.day07.User;

/**
 * 本类用来演示:user的接口
 *
 * @author: success
 * @date: 2020/8/6 10:55 上午
 */
public interface IUserDao extends IBaseDao<User>{
    //只要定义特有的方法
    void findUser();
}
