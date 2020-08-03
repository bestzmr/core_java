package tech.aistar.day10.myhomework;

/**
 * @author: Merlin
 * @time: 2020/7/31 19:41
 */
public interface IBookBiz {
    void deleteById(String id);
    //添加图书
    void add(Book book);
    //根据图书name 来删除指定图书
    void deleteByName(String name);
    //打印出所有的图书信息
    void outputAllBooks();
}
