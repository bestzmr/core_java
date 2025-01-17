package tech.aistar.day15.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:操作对象类型的文件的字节输入流/输出流 - 细节操作
 *
 * @author: success
 * @date: 2020/8/12 10:24 上午
 */
@SuppressWarnings("all")
public class ObjectStreamDetailDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(1,"1001","java");
        Book b2 = new Book(2,"1002","python");
        Book b3 = new Book(3,"1003","ai");

        //books.add(b1);
        //books.add(b2);
        books.add(b3);

       // save(books,"src/tech/aistar/day15/io/books.txt");

        List<Book> list = findAll("src/tech/aistar/day15/io/books.txt");

        if(null!=list && list.size()>0){
            list.forEach(e-> System.out.println(e));
        }
    }

    /**
     * 反序列化的过程
     * @param path
     * @return
     */
    public static List<Book> findAll(String path){
        ObjectInputStream in = null;

        List<Book> books = null;
        try {
            in = new ObjectInputStream(new FileInputStream(path));

            books = (List<Book>) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }

    /**
     * 序列化的过程
     * @param books
     * @param path
     */
    public static void save(List<Book> books,String path){
        //1. 构建一个能够支持对象类型的文件字节输出流
        ObjectOutputStream out = null;

        try {
            //true - 追加写入
            out = new ObjectOutputStream(new FileOutputStream(path,true));

            out.writeObject(books);

            System.out.println("保存集合成功!");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
