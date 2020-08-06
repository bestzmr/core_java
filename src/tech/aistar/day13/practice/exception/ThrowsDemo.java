package tech.aistar.day13.practice.exception;

import java.io.FileNotFoundException;

/**
 * @author: Merlin
 * @time: 2020/8/6 21:05
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            add();
            test01();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        test02();
    }
    public static void add() throws ClassNotFoundException {
        Class.forName("xxxx.xxx");
    }
    public static void test01() throws FileNotFoundException {
        throw new FileNotFoundException("文件不存在！");
    }
    public static void test02() {
        throw new RuntimeException("运行时异常！");
    }

}
