package tech.aistar.day15.io;

import java.io.*;

/**
 * 不推荐使用
 * 本类用来演示:第一个demo - 性能最低 - 单个字节单个字节进行读取和写入的
 *
 * @author: success
 * @date: 2020/8/12 9:33 上午
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        copy("src/tech/aistar/day15/io/001.jpg","src/tech/aistar/day15/io/001_副本.jpg");
    }

    /**
     * 文件的拷贝操作 - FileInputStream/FileOutputStream
     * 路径可是绝对或者相对路径(src开头)
     * @param src 原文件的位置
     * @param target 目标文件的位置
     */
    public static void copy(String src,String target){
        //1. 确定流对象

        InputStream in = null;
        OutputStream out = null;

        //2. 确定文件输入流 - 确定源头
        try {
            in = new FileInputStream(src);

            out = new FileOutputStream(target);

            //3. 单个字节单个字节进行读取.
            //定义一个变量 - 用来保存每次读取到的内容
            int len = -1;

            //循环读取
            while(true){
                //如果已经到达流的尾部,in.read()返回-1
                len = in.read();

                //循环退出的条件
                if(len == -1)
                    break;

                //System.out.print((char)len);
                //将内容写到out输入流中
                out.write(len);
            }
            System.out.println("文件拷贝成功!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {//IO异常是总的父类异常.
            e.printStackTrace();
        } finally {
            //专门进行一些释放资源的操作的.
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null!=out){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
