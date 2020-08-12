package tech.aistar.day15.myhomework;

/**
 * @author: Merlin
 * @time: 2020/8/12 15:39
 */


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DataInputStream/DataOutputStream
 * <p>
 * 使用这个流来保存id的值.
 * <p>
 * ~~~java
 * public Book(){
 * this.id = XXX.readId();
 * }
 * ~~~
 */
public class DataStreamDemo {
    public static void main(String[] args) {
//        writeIds();//往文件中写入id数据，写入完成后，改行注释
        Book book1 = new Book("java", 100.0d);
        Book book2 = new Book("python", 100.0d);
        Book book3 = new Book("web", 100.0d);
        System.out.println(book1.id);
        System.out.println(book2.id);
        System.out.println(book3.id);
    }

    public static void writeIds() {
        try {
            DataOutputStream da = new DataOutputStream(new FileOutputStream("src\\tech\\aistar\\day15\\io\\abc.txt"));
            for (int i = 100; i < 150; i++) {
                da.writeInt(i);
                da.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int readId() {
        int id = -1;
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src\\tech\\aistar\\day15\\io\\abc.txt"));
            id = dataInputStream.readInt();
            int id1;
            List<Integer> list = new ArrayList<>();
            while (true) {
                try {
                    id1 = dataInputStream.readInt();

                } catch (EOFException e) {
                    break;
                }
                list.add(id1);
            }
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src\\tech\\aistar\\day15\\io\\abc.txt"));
            for (int i = 0; i < list.size(); i++) {
                dataOutputStream.writeInt(list.get(i));
                dataOutputStream.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    static class Book {
        private int id;
        private String title;
        private double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = price;
            this.id = DataStreamDemo.readId();
        }
    }
}
