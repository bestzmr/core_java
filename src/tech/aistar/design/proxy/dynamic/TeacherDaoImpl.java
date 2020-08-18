package tech.aistar.design.proxy.dynamic;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 2:59 下午
 */
public class TeacherDaoImpl implements ITeacherDao{
    @Override
    public int find(int id) {
        System.out.println("find:"+id);
        return id;
    }

    @Override
    public void remove(int id) {
        System.out.println("id:"+id);
    }
}
