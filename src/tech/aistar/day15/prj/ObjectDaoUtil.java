package tech.aistar.day15.prj;

import tech.aistar.day15.io.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 8:54 上午
 */
public class ObjectDaoUtil {//设置成泛型类

    public static <T> List<T> findAll(String path){
        List<T> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))){
           list = (List<T>) in.readObject();
        } catch (FileNotFoundException e) {
            list = null;
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            list = null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @SuppressWarnings("all")
    public static <T> void save(T t,String path){
        //1. 先判断文件中是否已经存在曾经序列化过的对象
        List<T> oldList = findAll(path);

        //新建一个新的集合对象 - 用来为此次保存服务
        List<T> newList = new ArrayList<>();

        //2. 判断
        if(null!=oldList && oldList.size()>0){
            //将oldList中的所有的数据全部转移到newList集合中去哈
            newList.addAll(oldList);
        }
        newList.add(t);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))){
            out.writeObject(newList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
