package tech.aistar.day13.app;

import tech.aistar.day10.homework.book.Book;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 11:11 上午
 */
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao{
    @Override
    public void findBook() {
        System.out.println("bookk..");
    }
}
