package tech.aistar.day15.practice;


import java.io.File;
import java.io.IOException;

/**
 * @author: Merlin
 * @time: 2020/8/11 18:16
 */
public class FileDemo {
    public static void main(String[] args) {
        test01("");
        test02("");
        test03("");
        test04("");
        test05("");
        test06("");
        test07("");
        test08("");
    }

    public static void test01(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("sorry,文件不存在！");
            return;
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file);
        System.out.println(file.getPath());
        System.out.println(file.getParent());

    }
    public static void test02(String path) {
        File file = new File(path);

        if (file.exists()) {
            System.out.println("sorry,文件已经存在了！");
            return;
        }
        try {
            if (file.createNewFile()) {
                System.out.println(file + ",创建成功！");
            } else {
                System.out.println("sorry,文件创建失败！可能没有权限！");

            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void test03(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("sorry,文件已经存在了！");
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("sorry,不是一个有效的目录路径");
            return;
        }
        if (file.mkdir()) {
            System.out.println(file + ",创建成功！");

        } else {
            System.out.println("sorry,创建失败了！");
        }

    }

    public static void test04(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("sorry,目录已经存在了！");
            return;
        }
        if (file.mkdirs()) {
            System.out.println(file + ",创建成功！");
        } else {
            System.out.println("sorry,创建失败了!");
        }
    }

    public static void test05(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("sorry，目录不存在！1");
            return;
        }
        if (file.delete()) {
            System.out.println(file + "删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    public static void test06(String path) {
        File file = new File(path);
        File[] files = file.listFiles();

        if (null != files && file.length() > 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getAbsolutePath());

                } else if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        }
    }


    public static void test07(String path) {
        File file = new File(path);

        File[] files = file.listFiles();

        if (null != files && files.length > 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println(f.getAbsolutePath());
                    test07(f.getAbsolutePath());
                } else if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        }
    }


    public static void test08(String path) {
        File file = new File(path);
        File[] files = file.listFiles(new MyFileNameFileFilter(".gif"));

        if (null != files && files.length > 0) {
            for (File f : files) {
                if (f.isDirectory()) {
                    test08(f.getAbsolutePath());

                } else if (f.isFile()) {
                    System.out.println(f.getName());

                }
            }
        }
    }
}
