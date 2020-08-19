package tech.aistar.design.proxy.proxy_template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 本类用来演示: 模板 + 回调接口
 *
 * @author: success
 * @date: 2020/8/18 3:36 下午
 */
public class JdbcSuccessTemplate {

    public static void execute(IPsCallback cb){

        //jdbc代码 - 固定的编程步骤
        Connection conn = null;
        PreparedStatement pst = null;

        //获取DB连接
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/j08?useSSL=false","root","123456");

            //才是最核心的吧!!!!
//            pst = conn.prepareStatement("delete from Book where id = ?");
//            pst.setInt(1,id);

            pst = cb.test(conn);

            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(null!=pst){
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(null!=conn){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
