package tech.aistar.design.template.callback;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 4:45 下午
 */
public class TestCallback {
    public static void main(String[] args) {
        IStudentDao studentDao = new StudentDaoImpl();
        studentDao.find();

        System.out.println("===");
        ITeacherDao teacherDao = new TeacherDaoImpl();
        teacherDao.find();
    }
}
