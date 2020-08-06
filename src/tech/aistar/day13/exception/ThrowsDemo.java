package tech.aistar.day13.exception;

import java.io.FileNotFoundException;

/**
 * 本类用来演示:异常的消极处理
 *
 * @author: success
 * @date: 2020/8/6 3:56 下午
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        //选择在方法的最终的调用的地方统一进行积极处理..
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

    /**
     * 刚方法没有处理异常,而是抛出异常.
     * @throws ClassNotFoundException
     */
    public static void add() throws ClassNotFoundException {
        Class.forName("xxx.xx");
    }

    /**
     * 应用场景 - 会在程序代码中抛出自定义的异常..
     * @throws FileNotFoundException
     */
    public static void test01() throws FileNotFoundException {
        throw new FileNotFoundException("文件不存在!");
    }

    public static void test02(){
        throw new RuntimeException("运行时异常!");
    }
}
