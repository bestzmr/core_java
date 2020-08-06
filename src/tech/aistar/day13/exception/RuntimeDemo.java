package tech.aistar.day13.exception;

/**
 * 本类用来演示:运行时异常
 *
 * @author: success
 * @date: 2020/8/6 2:53 下午
 */
public class RuntimeDemo {
    public static void main(String[] args) {

        //当此行出现异常的时候,异常下方的代码将不会执行了...
        //理论上 - 运行时异常是不需要手动进行处理的.但是在有些业务场景下
        //也是可以进行处理的...

        try {
            //如果try中的代码发生了异常,那么就会进入到对应的catch块中去执行...
            String s = null;
            System.out.println(s.length());

        }catch (Exception e){//catch块是用来捕获异常
            //打印异常的堆栈信息
            //e.printStackTrace();
            System.out.println("ma 呀!ArithmeticException");

            //未来,进行程序运行时候的日志的记录,方便以后来排错!
        }

        //只要对异常进行了处理,积极处理之后,那么可以保证程序中一旦发生了异常
        //但是整个程序还是可能继续向下执行的.

        System.out.println("===end===");

    }
}
