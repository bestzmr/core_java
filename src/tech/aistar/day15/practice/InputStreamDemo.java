package tech.aistar.day15.practice;

import java.io.*;

/**
 * @author: Merlin
 * @time: 2020/8/12 9:49
 */
public class InputStreamDemo {
    public static void main(String[] args) {

    }

    public static void copy(String src, String target) {
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(target);
            int len = -1;
            while (true) {
                len = in.read();
                if (len == -1) {
                    break;
                }
                out.write(len);

            }
            System.out.println("文件拷贝完成！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            if (null != in) {
                try {
                    in.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != null) {
                try {
                    out.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
