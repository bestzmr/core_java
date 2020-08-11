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

        //test02("/Users/admin/Documents/aa/bb/12.txt");

        //File file = new File("/Users/admin/Documents/aa/bb/tt.txt");
        //System.out.println(file.isFile());

        //test05("/Users/admin/Documents/aa/bb/12.txt");

        test06("/Users/admin/Documents/success/d/Program Files/apache-tomcat-8.0.37");
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

    /**
     * 创建深层次的目录
     * @param path
     */
    public static void test04(String path){

            File file = new File(path);

            if(file.exists()){
                System.out.println("sorry,目录已经存在了!");
                return;
            }

            //判断file是否为目录
//        System.out.println(file.isFile());
//            if(file.isFile()){
//                System.out.println("sorry,不是一个有效的目录路径");
//                return;
//            }

            if(file.mkdirs()){//创建深层次的目录 , 一次只能创建多个.
                System.out.println(file+",创建成功!");
            }else{
                System.out.println("sorry,创建失败了!");
            }
    }

    /**
     * 删除空目录或者文件
     * @param path
     */
    public static void test05(String path){
        File file = new File(path);

        if(!file.exists()){
            System.out.println("sorry,目录不存在!");
            return;
        }
        //如果file是文件,直接删除
        //如果file是空目录,直接删除
        //如果file是非空目录,则删除失败
        if(file.delete()){
            System.out.println(file+"删除成功!");
        }else{
            System.out.println("删除失败!");
        }
    }

    public static void test06(String path){
        File file = new File(path);

        //只能获取第一层的子集方法...
        File[] files = file.listFiles();

        if(null!=files && files.length>0){
            for (File f : files) {
               //如果是目录,直接输出目录的绝对路径
                if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                }else if(f.isFile()){
                    System.out.println(f.getName());
                }
                //如果是文件,直接输出文件的名称
            }
        }
    }
}
