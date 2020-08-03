package tech.aistar.day10.homework.book;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 8:40 上午
 */
public class BookBizImpl implements IBookBiz{
    private static final int CAPACITY = 5;

    private int count; //代表有效图书数量

    private Book[] books = new Book[CAPACITY];

    @Override
    public void add(Book b) {
        //注意扩容...
        if(count == books.length){
            System.out.println("===两倍扩容===");
            books = Arrays.copyOf(books,books.length*2);
        }
        books[count++] = b;

    }

    @Override
    public void deleteByName(String name) {//name不是唯一的
        //先统计name图书的数量
        int pos = 0;

        for (int i = 0; i < count; i++) {
            if(books[i].getBookName().equals(name)){//字符串的比较用equals,只要字符串的值一样,那么就返回true
                pos++;
            }
        }
        //判断图书是否存在
        if(pos == 0){
            System.out.println("sorry,该图书不存在!");
            return;
        }

        //确定新的数组的长度
        Book[] temp = new Book[count - pos];

        //定义一个下标计数器器
        int index = 0;

        //遍历原来的数组
        for (int i = 0; i < count; i++) {
            if(!books[i].getBookName().equals(name)){
                temp[index++] = books[i];
            }
        }
        books = temp;
        //修改一下count的值,也发生了变化
        count = count - pos;
    }

    @Override
    public void delById(int id) {

    }

    @Override
    public void outputAllBooks() {
//        if(null!=books && books.length>0){
//            for (Book book : books) {
//                if(null!=book) {
//                    System.out.println(book);
//                }
//            }
//        }

        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
