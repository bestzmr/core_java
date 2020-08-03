package tech.aistar.day10.homework.book;

/**
 * 本类用来演示:图书业务类
 *
 * @author: success
 * @date: 2020/8/3 8:39 上午
 */
public interface IBookBiz {
    /**
     * 添加一本图书
     * @param b
     */
    void add(Book b);

    /**
     * 根据图书的名称进行删除 - 不是唯一的.删除的是多个
     * @param name
     */
    void deleteByName(String name);

    /**
     * 根据图书的id进行删除
     * @param id 是唯一的
     */
    void delById(int id);

    /**
     * 输出
     */
    void outputAllBooks();
}
