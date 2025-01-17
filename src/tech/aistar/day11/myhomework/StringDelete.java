package tech.aistar.day11.myhomework;

import org.junit.Test;

/**
 * @author: Merlin
 * @time: 2020/8/3 18:23
 */
public class StringDelete {
    /**
     * 1. 根据指定的字符串到原来的字符串中进行删除操作!//送分题
     * //helloworld
     * <p>
     * //del("ow","hellorld")
     * public static String del(String delStr,String oldStr){
     * <p>
     * }
     */
    /**
     * 第一种
     * @param delStr
     * @param oldStr
     * @return
     */
    public static String del(String delStr, String oldStr) {
        if (delStr.length() > oldStr.length()) {//要删除的字符串长度大于原字符串时，返回原字符串
            return oldStr;
        }
        if (!oldStr.contains(delStr)) {
            return oldStr;
        }
        StringBuilder stringBuilder = new StringBuilder(oldStr);
        int startIndex = stringBuilder.indexOf(delStr);
        return stringBuilder.delete(startIndex, startIndex + delStr.length()).toString();
    }

    public static String del2(String delStr, String oldStr) {
        StringBuilder stringBuilder = new StringBuilder(oldStr);
        int startIndex = stringBuilder.indexOf(delStr);
        if (startIndex == -1) {
            return stringBuilder.toString();
        } else {
            oldStr = stringBuilder.delete(startIndex, startIndex + delStr.length()).toString();
            del2(delStr, oldStr);
        }
        return null;

    }
    @Test
    public void stringDeleteTest() {
        String oldStr = "aabbccddeeff";
        String delStr = "bbcc";
        System.out.println(del(delStr, oldStr));
    }
}
