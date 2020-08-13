package tech.aistar.day15.prj;

import tech.aistar.day15.io.Book;
import tech.aistar.day15.prj.impl.BookDaoImpl;
import tech.aistar.day15.prj.impl.BookMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 8:38 上午
 */
public class TestBookDao {
    public static void main(String[] args) {
        IBookDao bookDao = new BookMapper();

        Book b1 = new Book("1001","java");
        Book b2 = new Book("1002","python");

//        List<Book> books = new ArrayList<>();
//       books.add(b1);
//        books.add(b2);
//
//        books.removeIf((b)->{
//            return b.getId() == 2;
//        });
//
//        books.forEach(e-> System.out.println(e));

        //测试保存...
        bookDao.save(b1);

      //  bookDao.delById(1);
//
//        //测试读取的
        List<Book> bookList = bookDao.findAll();
        if(null!=bookList && bookList.size()>0){
            bookList.forEach(e-> System.out.println(e));
        }


    }
}
