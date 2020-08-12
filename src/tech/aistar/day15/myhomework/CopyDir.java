package tech.aistar.day15.myhomework;

import java.io.File;

/**
 * @author: Merlin
 * @time: 2020/8/12 9:54
 */
public class CopyDir {
    public static void main(String[] args) {

    }

    public static void copyDir(String path,String target) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("sorry,文件不存在！");
        }
        File[] files = file.listFiles();
        for (File f : files) {
//            copyDir(f.getAbsolutePath());
        }
    }
}
