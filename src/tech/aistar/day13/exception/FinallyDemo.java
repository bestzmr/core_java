package tech.aistar.day13.exception;

import tech.aistar.day10.homework.book.Book;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 3:32 下午
 */
public class FinallyDemo {
    public static void main(String[] args) {
        add();

        System.out.println(test01());//1

        System.out.println(test02());//2

        System.out.println(test03());
    }

    /**
     * 当try中出现了return语句[结束整个方法的] - 请问finally中的代码执行否?
     *
     * return语句是在finally语句之后执行的.
     */
    public static void add(){
        try{
            int i = 0;
            System.out.println("try...");

            //return语句是在finally语句之后执行的.
            return;//结束整个方法的呀!
        }finally {
            System.out.println("finally...");
        }
    }

    /**
     * finally对基本类型的修改是否会影响整个结果
     *
     * 没有影响...
     *
     * 建议javap - 反编译
     * @return
     */
    public static int test01(){
        int i = 0;
        try{
            ++i;//i计算的结果 - 局部变量表中[临时的存储的位置]

            return i;//返回的是刚刚局部变量表中的i.
        }finally {
            ++i;//不会对i造成影响.
        }
    }

    public static int test02(){
        int i = 0;
        try{
            ++i;
            return i;
        }finally {
            return ++i; // finally中一旦出现了return语句,会对局部变量表存储的i产生影响了.
        }
    }

    /**
     * finally块中修改对象类型是否会影响呢? - 产生了影响了.
     * @return
     */
    public static Book test03(){
        Book b1 = new Book(1,"1001","java");

        try{
            b1.setBookName("python");
            return b1;
        }finally {
            b1.setBookName("web签单");
        }
    }
}
