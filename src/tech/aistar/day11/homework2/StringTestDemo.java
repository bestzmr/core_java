package tech.aistar.day11.homework2;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 8:32 上午
 */
public class StringTestDemo {
    public static void main(String[] args) {
        System.out.println(delStr("abcdebcsfd","bc"));

        String s1 = "dddddeoeospsffffffe";
        String s2 = "affffffedfdddddd09";

        System.out.println(commonStr(s1,s2));
    }

    /**
     * 替换
     * @param oldStr
     * @param delStr
     * @return
     */
    public static String delByStr(String oldStr,String delStr){
        return oldStr.replace(delStr,"");
    }

    public static String delStr(String oldStr,String delStr){
        //1. 递归出口
        if(!oldStr.contains(delStr))
            return oldStr;
        //2.abcdebcff - > bc
        //获取起始索引
        int startIndex = oldStr.indexOf(delStr);
        //获取结束索引
        int endIndex = startIndex + delStr.length();
        //进行删除操作
        //String->StringBuilder
        StringBuilder builder = new StringBuilder(oldStr);
        builder.delete(startIndex,endIndex);//[startIndex,endIndex);

        //builder -> adebcff - > bc

        //StringBuiler -> String
        return delStr(builder.toString(),delStr);
    }

    /**
     * 求最大长度的公串.
     * @param firstStr
     * @param secStr
     * @return
     */
    public static String commonStr(String firstStr,String secStr){
        //由于最大长度的公串有可能出现多个的.
        StringBuilder builder = new StringBuilder();

        //定义一个变量
        int len = 0;

        //1. 遍历firstStr - 得出第一个字符串的所有的子集.
        for (int i = 0; i < firstStr.length(); i++) {
            for (int j = i+1; j <=firstStr.length() ; j++) {
                //获取当前的firstStr的子串.
                String subStr = firstStr.substring(i,j);//[i,j)
                //获取这个子串的长度
                int length = subStr.length();

                //判断secStr中是否包含这个subStr
                if(secStr.contains(subStr) && length>len){
                    //考虑是否要将subStr放入到StringBuilder中.
                    //清空builder
                    builder.delete(0,builder.capacity());
                    builder.append(subStr+"\t");
                    len = length;
                }else if(secStr.contains(subStr) && length == len){
                    builder.append(subStr);
                }
            }
        }
        return builder.toString();
    }
}
