package tech.aistar.day15.prj;

import java.io.*;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 9:12 上午
 */
public class IdWorker {
    public static final String ID_PATH = "src/tech/aistar/day15/prj/id.txt";

    private static void write(long v){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ID_PATH))){
            out.writeLong(v);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long read(){
        long data = 1L;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(ID_PATH))){
            data = in.readLong();//第二次及其以后读取成功...
            write(data+1);
        }  catch (IOException e) {
            //第一次进入这里.
            //e.printStackTrace();
            write(data+1);
        }
        return data;
    }

//    public static void main(String[] args) {
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//        System.out.println(read());
//    }
}
