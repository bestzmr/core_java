package tech.aistar.design.proxy.proxy_template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 本类用来演示: 回调接口
 *
 * @author: success
 * @date: 2020/8/18 3:38 下午
 */
@FunctionalInterface
public interface IPsCallback {
    PreparedStatement test(Connection conn) throws SQLException;
}
