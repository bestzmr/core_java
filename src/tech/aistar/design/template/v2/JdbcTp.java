package tech.aistar.design.template.v2;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 10:30 上午
 */
public abstract class JdbcTp {//jdbc - 用java编写程序和数据库进行连接

    public final void execute(){
        System.out.println("1. 加载驱动");//打印的语句 - 一系列的编程步骤
        System.out.println("2. 连接DB");

        //获取数据...
        //每次获取的数据可能是不一样的 - 延迟到子类中去实现.
        //TODO...
        executeSql();

        System.out.println("3. 关闭连接");
    }

    public abstract void executeSql();
}

//会产生很多多余的子类
class JdbcSub01 extends JdbcTp{

    @Override
    public void executeSql() {
        System.out.println("select * from student");
    }
}

class TestSub01{
    public static void main(String[] args) {
        JdbcTp s = new JdbcSub01();
        s.execute();
        System.out.println("===");


        JdbcTp s2 = new JdbcTp() {
            @Override
            public void executeSql() {
                System.out.println("select * from teacher");
            }
        };
        s2.execute();

        System.out.println("=====");

        new JdbcTp() {
            @Override
            public void executeSql() {
                System.out.println("select * from course");
            }
        }.execute();
    }
}
