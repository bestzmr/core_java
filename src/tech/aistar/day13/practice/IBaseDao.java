package tech.aistar.day13.practice;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:50
 */
public interface IBaseDao<T> {
    void save(T t);

    void update(T t);

    void delById(Integer id);
}
