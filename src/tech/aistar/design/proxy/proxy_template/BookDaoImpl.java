package tech.aistar.design.proxy.proxy_template;

import java.sql.PreparedStatement;


/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 3:29 下午
 */
public class BookDaoImpl implements IBookDao{
    @Override
    public void del(int id) {
        JdbcSuccessTemplate.execute(conn -> {
            PreparedStatement pst = conn.prepareStatement("delete from Book where id=?");
            pst.setInt(1,id);
            return pst;
        });
    }
}
