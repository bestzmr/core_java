package tech.aistar.day13.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 本类用来演示:异常的积极处理方式
 *
 * @author: success
 * @date: 2020/8/6 2:59 下午
 */
public class TryCatchDemo {
    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("src/tech/aistar/day13/Sup.java");

            Class.forName("tech.aistar.day03.User");
        }

//        }catch (Exception e){
//            e.printStackTrace();
//        }
        catch (FileNotFoundException e) {//文件不存在的异常
            e.printStackTrace();
            System.out.println("文件不存在!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("类找不到...");
        }

        System.out.println("===end===");

        try {
            InputStream in = new FileInputStream("src/tech/aistar/day13/Sup.java");
            Class.forName("tech.aistar.day03.User");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("===");

        try {
            InputStream in = new FileInputStream("src/tech/aistar/day13/Sup.java");
            Class.forName("tech.aistar.day03.User");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
