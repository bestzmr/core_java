package tech.aistar.day15;

import java.io.File;

/**
 * @author: Merlin
 * @time: 2020/8/11 15:36
 */
public class PracticeListFile {
    public static void main(String[] args) {
        listFileTest("D:\\驰星");

    }

    public static void listFileTest(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {

                System.out.println("文件夹地址：" + file1.getAbsolutePath());
                listFileTest(file1.getAbsolutePath());
            } else {
                System.out.println("文件名:"+file1.getName());
            }
        }
    }
}
