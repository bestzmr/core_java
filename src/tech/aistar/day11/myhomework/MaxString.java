package tech.aistar.day11.myhomework;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: Merlin
 * @time: 2020/8/3 18:35
 */
public class MaxString {
    /**
     * 第一个串: abcdededeffffffoo
     * 第二个串: ffffffpopodededekkk
     * <p>
     * 找俩个字符串中的最大长度的公串.
     * dedede ffffff
     */
    public String[] maxString(String str1, String str2) {
        String[] strings = new String[Math.max(str1.length(), str2.length())];
        Arrays.fill(strings, null);
        int max = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j < str1.length()+1; j++) {
                if (str2.contains(str1.substring(i, j))) {
                    if (max < j - i) {
                        max = j - i;
                    }
                }
            }
        }
        int pos = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j < str1.length()+1; j++) {
                if (str2.contains(str1.substring(i, j))) {
                    if (max == j - i) {
                        String string = str1.substring(i, j);
                        boolean flag = false;
                        for (int k = 0; k <pos ; k++) {
                            if (strings[k].equals(string)) {
                                flag = true;
                            }
                        }
                        if (!flag) {
                            strings[pos++] = string;
                        }

                    }
                }
            }
        }

        return Arrays.copyOf(strings, pos);
    }
    @Test
    public void maxStringTest() {
        System.out.println(Arrays.deepToString(maxString("abcdededeffffffoo", "ffffffpopodededekkk")));
    }
}
