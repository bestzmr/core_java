package tech.aistar.day13.practice;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:51
 */
public class BaseDaoImpl implements IBaseDao{
    @Override
    public void save(Object o) {
        System.out.println("保存。。。");
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delById(Integer id) {

    }
}
