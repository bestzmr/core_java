package tech.aistar.design.template.callback;

/**
 * 本类用来演示:回调接口
 *
 * @author: success
 * @date: 2020/7/31 4:40 下午
 */
public class CallbackTemplate {

    public static void execute(ICallback callback){
        System.out.println("1. 加载驱动...");
        System.out.println("2. 连接DB");

        //写sql语句...
        callback.executeSql();

        System.out.println("4.释放资源..");
    }

}
