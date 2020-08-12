package tech.aistar.day15.myhomework;

import tech.aistar.day15.io.BufferedArrayDemo;

import java.io.File;

/**
 * @author: Merlin
 * @time: 2020/8/12 9:54
 */
public class CopyDir {
    public static void main(String[] args) {
        copyDir("C:\\Users\\Merlin\\Desktop\\dir","C:\\Users\\Merlin\\Desktop\\copy");
    }
    public static void copyDir(String path,String target) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("sorry,文件不存在！");
        }
        File file1 = new File(target+"\\"+file.getName());//拷贝顶层目录
        file1.mkdir();//创建顶层目录
        File[] files = file.listFiles();//顶层目录下的文件数组
        for (File f : files) {
            if (f.isDirectory()) {//数组中的元素是目录
                copyDir(f.getAbsolutePath(),file1.getAbsolutePath());
            } else if (f.isFile()) {//数组中的元素是文件
//                ArrayStreamDemo.copy(f.getAbsolutePath(),file1.getAbsolutePath()+"\\"+f.getName());//用最原始的字节流拷贝
                BufferedArrayDemo.copy(f.getAbsolutePath(),file1.getAbsolutePath()+"\\"+f.getName());//用缓冲区的字节流拷贝
            }


        }
    }
}
