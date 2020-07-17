package tech.aistar.day02;

/**
 * 本类用来演示:
 * JVM是怎么对待变量和字面量的
 *
 * @author: success
 * @date: 2020/7/17 10:23 上午
 */
public class JVMType {
    public static void main(String[] args) {
       int n = 2;

       while(n>1){
           System.out.println("while..");
       }
       //unreachable statement
        //while(2>1) - 编译错误
        //why?
        //因为jvm执行到2>1的时候,由于2就是字面量,已经确定了值.jvm就可以精确的知道
        //它的比较的结果,必然是true

        //但是当你使用while(n>2),jvm遇到变量n,不会关心n的具体的保存的数值.
        //只会关心这个变量的数据类型 - 决定了这个变量可变化的范围.
        //认为n是有可能小于数字1的,while下面的代码就有可能会执行.所以不会报编译错误.
        System.out.println("===");

        byte b = 100;//100是一个字面量.底层继续判断100是否在byte类型的范围[-128-127]
                    //然后继续在底层进行强制类型转换[int->byte]->存储

        //因为m是一个变量,jvm就会认为m浮动范围是在int的范围,就有可能会在byte类型范围之外.
        //不允许这种风险发生在程序的运行期间,所以就要求必须要程序的编译期间进行强制类型转换.
        int m = 100;
        byte bt = (byte) m;
    }
}
