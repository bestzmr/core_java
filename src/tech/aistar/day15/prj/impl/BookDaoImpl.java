package tech.aistar.day15.prj.impl;

import tech.aistar.day10.homework.book.Book;
import tech.aistar.day15.prj.IBookDao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/12 11:06 上午
 */
public class BookDaoImpl implements IBookDao {

    @Override
    public List<Book> findAll() {
        File file = new File("src/tech/aistar/day15/prj/abc.txt");
        try {
            if (!file.exists()) {//判断文件是否存在
                System.out.println("文件不存在！");
                return null;
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/tech/aistar/day15/prj/abc.txt"));
            List<Book> list = null;
            try {
                list = (List<Book>) objectInputStream.readObject();//判断文件的流是否合法
                if (list == null) {
                    System.out.println("文件内容为空！");
                }
            } catch (StreamCorruptedException e) {
                System.out.println("文件内容不合法！");
                return null;
            }
            list.forEach(x -> System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delById(int id) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/tech/aistar/day15/prj/abc.txt"));
            List<Book> list = (List<Book>) objectInputStream.readObject();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.remove(i);
                    break;
                }
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/tech/aistar/day15/prj/abc.txt"));
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Book b) {
        List<Book> list = null;
        try {

            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/tech/aistar/day15/prj/abc.txt"));
                list = (List<Book>) objectInputStream.readObject();
            } catch (EOFException e) {
                e.printStackTrace();
                System.out.println("-----------");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(b);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/tech/aistar/day15/prj/abc.txt"));
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
