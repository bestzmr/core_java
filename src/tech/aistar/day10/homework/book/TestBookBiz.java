package tech.aistar.day10.homework.book;

import java.util.Date;
import java.util.UUID;

/**
 * 本类用来演示:测试类
 *
 * @author: success
 * @date: 2020/8/3 8:47 上午
 */
public class TestBookBiz {
    public static void main(String[] args) {
        //System.out.println(UUID.randomUUID().toString());
        Book b1 = new Book(1, UUID.randomUUID().toString(),"丰乳肥臀",100.0d,"莫言",new Date());
        Book b2 = new Book(2, UUID.randomUUID().toString(),"等一个人的咖啡",90.0d,"九把刀",new Date());
        Book b3 = new Book(3, UUID.randomUUID().toString(),"西游记",80.0d,"吴承恩",new Date());
        Book b4 = new Book(4, UUID.randomUUID().toString(),"水浒传",70.0d,"施耐庵",new Date());
        Book b5 = new Book(5, UUID.randomUUID().toString(),"等一个人的开发",100.0d,"十把刀",new Date());
        Book b6 = new Book(6, UUID.randomUUID().toString(),"丰乳肥臀",60.0d,"莫言",new Date());

        IBookBiz biz = new BookBizImpl();

        //添加图书的方法
        biz.add(b1);
        biz.add(b2);
        biz.add(b3);
        biz.add(b4);
        biz.add(b5);

        biz.add(b6);

        //删除..
        //biz.deleteByName("丰乳肥臀");
        biz.delById(5);

        //调用输出所有的图书
        biz.outputAllBooks();

    }
}
