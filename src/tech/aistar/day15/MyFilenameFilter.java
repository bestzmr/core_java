package tech.aistar.day15;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/11 3:49 下午
 */
public class MyFilenameFilter implements FilenameFilter {

    private String suffix;//定义一个后缀

    public MyFilenameFilter(String suffix){
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File dir, String name) {
        //File还有一个构造 - File(File dir,String name);
        File file = new File(dir,name);

        //只要找出文件...
        if(file.isDirectory())
            return true;//如果目录直接return false,说明这个目录都不会进去了.

        if(file.getName().endsWith(suffix))
            return true;

        return false;//不输出..
    }
}
