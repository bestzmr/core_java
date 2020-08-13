package tech.aistar.day15.homework;

import java.io.*;

/**
 * 本类用来演示:目录的拷贝
 *
 * @author: success
 * @date: 2020/8/13 9:41 上午
 */
@SuppressWarnings("all")
public class FolderCopyDemo {
    public static void main(String[] args) {
        copyFolder("/Users/admin/Documents/jdk1.8.0_66","/Users/admin/Documents/jdk1.8.0_66_copy");
    }

    /**
     * 完成目录的拷贝
     * @param src
     * @param target
     */
    public static void copyFolder(String src,String target){
        //构建原文件的路径
        File file = new File(src);

        if(file.isFile()){
            //如果是文件,直接调用拷贝的方法
            copyFile(src,target);
        }else if(file.isDirectory()){
            //构建目标的file - 文件夹的拷贝 - 文件夹的创建
            File fileb = new File(target);
            if(!fileb.exists()){
                fileb.mkdirs();
            }
            String[] names = file.list();//获取File下面的所有的第一级的子目录的名称
            //递归调用自己
            for (String name : names) {
                copyFolder(src+"/"+name,target+"/"+name);
            }
        }
    }


    /**
     * 文件的拷贝
     * @param src
     * @param target
     */
    public static void copyFile(String src,String target){
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target))){

            int len = -1;

            //自定义缓冲区数组
            byte[] buf = new byte[8*1024];//面向内存的 - 会把底层的数组中的数据读取到buf中

            while(true){
                //和不使用这个缓冲流的区别:
                //底层的默认初始化的这个缓冲数组8*1024 作用:面向磁盘的

                //初始化BufferedInputStream对象的时候同时初始化了这个数组,然后
                //会把一定数量的数据加载到这个数组中.

                //然后执行read方法的时候,实际上是从底层的这个缓冲数组中读取内容的.

                //一旦底层的缓存数组中的数据被读取完毕之后,自动再接着将磁盘中下面的数据接着
                //读取到底层的字节数组中.
                //len = in.read();
                len = in.read(buf);
                if(len == -1){
                    break;
                }
                out.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
