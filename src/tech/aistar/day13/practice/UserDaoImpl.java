package tech.aistar.day13.practice;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:54
 */
public class UserDaoImpl extends BaseDaoImpl implements IUserDao{
    @Override
    public void find() {
        System.out.println("找到User。。。");
    }
}
