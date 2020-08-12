package tech.aistar.day15.prj.impl;

import tech.aistar.day10.homework.book.Book;
import tech.aistar.day15.prj.IBookDao;

import java.io.*;
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
        File file = new File("");
        try {
            if (!file.exists()) {//判断文件是否存在
                return null;
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(""));
            if (objectInputStream.read() == -1) {//判断文件内容是否为空
                return null;
            }
            try {
                objectInputStream.readObject();//判断文件的流是否合法
            } catch (StreamCorruptedException e) {
                return null;
            }
            List<Book> list = (List<Book>) objectInputStream.readObject();
            list.forEach(x-> System.out.println(x));
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
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(""));
            List<Book> list = (List<Book>) objectInputStream.readObject();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    list.remove(i);
                    break;
                }
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(""));
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void save(Book b) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(""));
            List<Book> list = (List<Book>) objectInputStream.readObject();
            list.add(b);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(""));
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
