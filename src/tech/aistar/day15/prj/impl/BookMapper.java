package tech.aistar.day15.prj.impl;

import tech.aistar.day15.io.Book;
import tech.aistar.day15.prj.IBookDao;
import tech.aistar.day15.prj.ObjectDaoUtil;

import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 8:58 上午
 */
public class BookMapper implements IBookDao {
    //模拟数据库 - 文件
    private static final String PATH = "src/tech/aistar/day15/prj/db/books.dat";

    @Override
    public List<Book> findAll() {
        return ObjectDaoUtil.findAll(PATH);
    }

    @Override
    public void delById(int id) {

    }

    @Override
    public void save(Book b) {
        ObjectDaoUtil.save(b,PATH);
    }
}
