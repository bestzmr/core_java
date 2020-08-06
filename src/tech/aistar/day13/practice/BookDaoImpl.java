package tech.aistar.day13.practice;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:53
 */
public class BookDaoImpl extends BaseDaoImpl implements IBookDao {
    @Override
    public void find() {
        System.out.println("找到book");
    }
}
