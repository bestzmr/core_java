package tech.aistar.day01;

/**
 * 本类用来演示:用户接口
 *
 * @author: success
 * @date: 2020/7/16 4:57 下午
 */
public interface IUserDao {

    /**
     * 根据id进行删除操作
     * @param id 用户的id
     * @return 没有
     */
    int del(int id);
}
