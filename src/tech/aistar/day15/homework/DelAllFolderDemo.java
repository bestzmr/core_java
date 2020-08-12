package tech.aistar.day15.homework;

import java.io.File;

/**
 * 本类用来演示:删除目录
 *
 * @author: success
 * @date: 2020/8/12 8:33 上午
 */
public class DelAllFolderDemo {
    public static void main(String[] args) {
        delAllFolder("/Users/admin/Documents/demo");
    }

    public static void delAllFolder(String path){
        //1. 构建File实例
        File file = new File(path);
        //2. 判断是否存在
        if(!file.exists()){
            System.out.println("sorry,目录不存在!");
        }
        File[] files = file.listFiles();

        if(null!=files && files.length>0){
            for (File f : files) {
                if(f.isDirectory()){
                    //递归调用自己

                    delAllFolder(f.getAbsolutePath());
                    f.delete();
                }else if(f.isFile()){
                    f.delete();
                }
                f.delete();
            }
        }
        file.delete();
    }
}
