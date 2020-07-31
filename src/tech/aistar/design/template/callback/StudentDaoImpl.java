package tech.aistar.design.template.callback;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 4:44 下午
 */
public class StudentDaoImpl implements IStudentDao{
    @Override
    public void find() {
//        CallbackTemplate.execute(new ICallback() {
//            @Override
//            public void executeSql() {
//                System.out.println("select * from student;");
//            }
//        });
        CallbackTemplate.execute(()-> System.out.println("select * from students"));
    }
}
