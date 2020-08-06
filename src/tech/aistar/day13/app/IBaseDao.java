package tech.aistar.day13.app;

/**
 * 本类用来演示: 顶级的业务接口
 *
 * @author: success
 * @date: 2020/8/6 10:58 上午
 */
public interface IBaseDao<T> {
    void save(T t);

    void update(T t);

    void delById(Integer id);
}
