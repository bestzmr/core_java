package tech.aistar.day15.prj;



import tech.aistar.day10.homework.book.Book;
import tech.aistar.day15.prj.impl.BookDaoImpl;

/**
 * @author: Merlin
 * @time: 2020/8/12 20:41
 */
public class TestBook {
    public static void main(String[] args) {
        BookDaoImpl bookDao = new BookDaoImpl();
        Book book = new Book(2, "1002", "java");
//        bookDao.save(book);
        bookDao.findAll();
//        bookDao.delById(1);
    }
}
