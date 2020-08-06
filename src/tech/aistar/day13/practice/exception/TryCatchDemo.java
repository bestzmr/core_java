package tech.aistar.day13.practice.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: Merlin
 * @time: 2020/8/6 21:07
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            File file;
            InputStream in = new FileInputStream("src/tech/aistar/day13/practice/exception");
            Class.forName("tech.aistar.day03.User");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println("文件不存在");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("类找不到");

        }
        System.out.println("---------end------------");
        try {
            File file;
            InputStream inputStream = new FileInputStream("src/tech/aistar/day13/practice/exception");
            Class.forName("tech.aistar.day03.User");
        } catch (FileNotFoundException | ClassNotFoundException exception) {
            exception.printStackTrace();

        }finally {
            System.out.println("我都会执行");
        }
        System.out.println("======");
        try {
            File file;
            InputStream inputStream = new FileInputStream("src/tech/aistar/day13/practce/exception");
            Class.forName("tech.aistar.day03.User");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
