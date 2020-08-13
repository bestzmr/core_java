package tech.aistar.day15.prj.impl;

import tech.aistar.day15.io.Book;
import tech.aistar.day15.prj.IBookDao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/12 11:06 上午
 */
public class BookDaoImpl implements IBookDao {

    //模拟数据库 - 文件
    private static final String PATH = "src/tech/aistar/day15/prj/db/books.dat";

    /**
     * 如果文件存在,但是文件内容为空,抛出java.io.EOFException
     * 已经到达文件的末尾
     * @return
     */
    @Override
    public List<Book> findAll() {
        List<Book> books = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH))){
            books = (List<Book>) in.readObject();
        } catch (FileNotFoundException e) {
            books = null;
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            books = null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void delById(int id) {
        List<Book> oldList = findAll();
        if(null!=oldList && oldList.size()>0){
//           oldList.removeIf(new Predicate<Book>() {
//               @Override
//               public boolean test(Book book) {
//                   //如果返回true,则剔除.返回false则保留.
//                   return false;
//               }
//           });
            oldList.removeIf((b) ->{return id == b.getId();});

            //再次写入

            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH))){
                out.writeObject(oldList);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("sorry,不存在!");
        }
    }

    @Override
    public void save(Book b) {
        //1. 先判断文件中是否已经存在曾经序列化过的对象
        List<Book> oldList = findAll();

        //新建一个新的集合对象 - 用来为此次保存服务
        List<Book> newList = new ArrayList<>();

        //2. 判断
        if(null!=oldList && oldList.size()>0){
            //将oldList中的所有的数据全部转移到newList集合中去哈
            newList.addAll(oldList);
        }
        newList.add(b);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH))){
            out.writeObject(newList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
