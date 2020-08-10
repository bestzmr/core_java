package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 本类用来演示:集合的删除操作
 *
 * @author: success
 * @date: 2020/8/10 9:20 上午
 */
public class RemoveListDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(1,"1001","java");
        Book b2 = new Book(2,"1002","python");
        Book b3 = new Book(3,"1003","java");
        Book b4 = new Book(4,"1004","java");
        Book b5 = new Book(5,"1005","java");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        //理解一下集合中的对象

       // Book b6 = new Book(5,"1005","java");

        //删除的是集合中已经存在的对象.
        //因为Book中提供了hashcode和equals方法,只要认为俩个对象的id的值是一样的,就认为这俩个对象是同一个对象.
        //books.remove(b6);

        //removeByBookName(books,"java");

        safeDel(books,"java");

        //可以通过foreach循环来进行遍历.
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * 安全的删除方式 - 普通for循环...
     * 根据图书的名称进行删除操作
     * @param bookName
     */
    private static void removeByBookName(List<Book> books,String bookName){
//        for (int i = 0; i < books.size(); i++) {
//            //boolean remove(int index);//根据下标进行删除
//            //boolean remove(E e);
//            if(books.get(i).getBookName().equals(bookName)){
//                books.remove(i);//涉及到下标的移动 - ArrayList集合的增删效率比较的原因.
//                i--;
//            }
//        }

        for (int i = books.size()-1; i >=0 ; i--) {
            if(books.get(i).getBookName().equals(bookName)){
                books.remove(i);
            }
        }
    }

    /**
     * 非安全删除...
     * 增强for循环是一个只读的循环.
     * 禁止在遍历集合的同时,再去进行删除操作.
     * 如果执行了这个操作,它会抛出一个并发修改的异常....
     * @param list
     * @param bookName
     */
    private static void unSafeDel(List<Book> list,String bookName){
        for (Book book : list) {//调用迭代器对象
            if(book.getBookName().equals(bookName)){
                list.remove(book);//直接删除对象...
            }
        }
    }

    private static void safeDel(List<Book> list,String bookName){
//        Iterator<Book> iter = list.iterator();
//        while(iter.hasNext()){
//            Book b = iter.next();
//            if(b.getBookName().equals(bookName)){
//                list.remove(b);//并发修改异常...
//            }
//        }
        Iterator<Book> iter = list.iterator();

        while(iter.hasNext()){
            Book b = iter.next();

            if(b.getBookName().equals(bookName)){
                //list.remove(b);//并发修改异常...

                //删除正在被迭代到的对象.
                iter.remove();
            }
        }
    }
}
