package tech.aistar.day15.io;

import java.io.*;

/**
 * 本类用来演示:使用字符流来完成拷贝 - 只能操作字符文件.
 *
 * @author: success
 * @date: 2020/8/13 9:37 上午
 */
public class ReaderAndWriterDemo {
    public static final String SRC = "src/tech/aistar/day15/io/001.jpg";
    public static final String TARGET = "src/tech/aistar/day15/io/001_reader.jpg";
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader(SRC));
            PrintWriter out = new PrintWriter(new FileWriter(TARGET))){

            String line = null;

            while((line = in.readLine())!=null){
                out.println(line);
            }
            System.out.println("拷贝成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
