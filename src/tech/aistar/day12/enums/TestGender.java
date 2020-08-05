package tech.aistar.day12.enums;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 3:13 下午
 */
public class TestGender {
    public static void main(String[] args) {
        Student s1 = new Student(1,"admin",Gender.F);

        System.out.println(s1);

        //实战注意点
        //注册业务..
        //一般这些数据 肯定是从网页上的表单控件输入的数据输入完毕之后,点击注册按钮之后
        //然后这些数据统一发送到后台.

        //只能在控制台输入 - 从键盘获取输入吧..

        //网页上输入的数据 -> 后台过程
        //后台都是使用String类型来接受

        String ids = "10";
        String name = "admin";
        String sex = "M";

        //类型的转换操作...
        Integer id = Integer.valueOf(ids);
        //重点就是要转换"F" -> 绑定到Gender枚举的实例F上.

        Gender gender = Enum.valueOf(Gender.class,sex);

        Student s2 = new Student(id,name,gender);
        System.out.println(s2);
    }
}
