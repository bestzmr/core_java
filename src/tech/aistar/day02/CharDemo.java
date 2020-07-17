package tech.aistar.day02;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/17 1:48 下午
 */
public class CharDemo {
    public static void main(String[] args) {
        //char类型可以用来存储特殊符号
        // \n和\r
        // \n = 换行 - 当输入完毕之后,光标是停在下一行的起始位置
        // \r = 回车 - 当输入完毕之后,光标是停在当前行的起始位置

        // \ 代表转义字符
        char c = '\n';
       // System.out.println("hello"+c+"world");

        //System.out.println("hello\nworld");

        //看终端
        //PPO
        System.out.println("OOO\rPP");

        //java底层unicode编码 - 统一使用2个字节进行存储 -高8位 低8位

        //.java文件utf-8/gbk - 字母都是采用1个字节
        char c1 = 'a';
        System.out.println("c1:"+c1);

        //int n = 48;
        char c2 = 48;//字符0 - '0'
        System.out.println("c2:"+c2);

        char c3 = '我';
        System.out.println("c3:"+c3);

        //windows - cmd - native2ascii - 输入名字
        char c4 = '\u2f12';
        System.out.println("c4:"+c4);//


        //关于char类型的计算
        //char类型在计算的时候会转换成ascii来进行的

        // 'a'->97+1->98->强制类型转换成char
        char result = 'a' + 1;//ok
        System.out.println("result:"+result);//'b'

        char result2 = (char) (result + 1);
        System.out.println("result2:"+result2);//'c'

        int m = 'a'+1;
        System.out.println("m:"+m);//98

        char cc = 'A';
        int mm = cc-'0';//65 - 48=17
        System.out.println("mm:"+mm);

    }
}
