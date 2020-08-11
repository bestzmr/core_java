package tech.aistar.day15.myhomework;

import java.io.File;

/**
 * @author: Merlin
 * @time: 2020/8/11 15:42
 */
public class DeleteFolder {
    public static void main(String[] args) {
        delFolder("C:\\Users\\Merlin\\Desktop\\a");
    }

    public static void delFolder(String path) {

        File file = new File(path);
        File[] files = file.listFiles();
        if (null != files && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    delFolder(files[i].getAbsolutePath());
                }
                files[i].delete();

            }
        }
        file.delete();
    }
}
