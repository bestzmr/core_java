package tech.aistar.day13.app;

import tech.aistar.day07.User;
import tech.aistar.day10.homework.book.Book;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 11:10 上午
 */
public class TestUserDaoImpl {
    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();

        User user = new User();
        user.setUsername("admin");

        userDaoImpl.save(user);

        BookDaoImpl bookDao = new BookDaoImpl();

        Book book = new Book();

        book.setBookName("西游记");

        bookDao.save(book);

        System.out.println("===");

        IUserDao userDao2 = new UserDaoImpl();
        userDao2.save(user);
    }
}
