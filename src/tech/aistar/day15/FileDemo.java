package tech.aistar.day15;

import java.io.File;
import java.io.IOException;

/**
 * 本类用来演示: java.io.File
 *
 * @author: success
 * @date: 2020/8/11 2:43 下午
 */
public class FileDemo {
    public static void main(String[] args) {
        //test01("src/tech/aistar/day15");//相对路径.. 必须从src开始.

        //test02("src/tech/aistar/day15/success.txt");

        test03("/Users/admin/Documents/aa/bb.txt");
    }

    /**
     *
     * @param path 文件或者目录的路径.
     *             绝对或者相对路径.
     */
    public static void test01(String path){
        //1. 利用一个路径来构建一个file实例
        File file = new File(path);

        //判断file是否存在
        if(!file.exists()){
            System.out.println("sorry,文件不存在!");
            return;
        }

        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());

        //2. 获取file的名称 - 如果是一个文件,文件的名称是包含后缀的.
        System.out.println(file.getName());

        System.out.println(file);//src/tech/aistar/day15/File.txt

        System.out.println(file.getPath());//src/tech/aistar/day15/File.txt

        System.out.println(file.getParent());//src/tech/aistar/day15
    }

    /**
     * 文件的创建
     * @param path
     */
    public static void test02(String path){
        //1. 构建一个File实例
        File file = new File(path);

        //2. 判断一下文件是否存在
        if(file.exists()){
            System.out.println("sorry,文件已经存在了!");
            return;
        }

        //3. 调用创建文件的方法
        try {
            if(file.createNewFile()){//如果成功创建,则返回true
                System.out.println(file+",创建成功!");
            }else{
                System.out.println("sorry,文件创建失败!可能没有权限!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建目录...
     * @param path
     */
    public static void test03(String path){
        File file = new File(path);

        if(file.exists()){
            System.out.println("sorry,目录已经存在了!");
            return;
        }

        //判断file是否为目录
        if(!file.isDirectory()){
            System.out.println("sorry,不是一个有效的目录路径");
            return;
        }

        if(file.mkdir()){//创建单层次的目录 , 一次只能创建一个.
            System.out.println(file+",创建成功!");
        }else{
            System.out.println("sorry,创建失败了!");
        }
    }
}
