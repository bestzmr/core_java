package tech.aistar.day15.practice;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author: Merlin
 * @time: 2020/8/11 18:35
 */
public class MyFileNameFileFilter implements FilenameFilter {
    private String suffix;

    public MyFileNameFileFilter(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        if (file.isDirectory()) {
            return true;
        }
        if (file.getName().endsWith(suffix)) {
            return true;
        }
        return false;
    }
}
