package tech.aistar.design.proxy.proxy_template;


/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 3:34 下午
 */
public class TestBook {
    public static void main(String[] args) {
        IBookDao bookDao = new BookDaoImpl();

        bookDao.del(2);
    }
}
