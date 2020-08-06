package tech.aistar.day13.practice;

import tech.aistar.day07.User;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:55
 */
public class TestUserDaoImpl {
    static BookDaoImpl bookDao = new BookDaoImpl();
    static UserDaoImpl userDao = new UserDaoImpl();

    public static void main(String[] args) {
        bookDao.find();
        userDao.find();
    }
}
