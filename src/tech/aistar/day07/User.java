package tech.aistar.day07;

import java.util.Date;

/**
 * 本类用来演示:用户实体类
 *
 * @author: success
 * @date: 2020/7/27 10:18 上午
 */
public class User {
    //封装 - 私有化属性,提供getter/setter
    //私有的属性只能在本类中被允许使用.
    private int id;

    private String username;

    private String password;

    //注册时间.
    private Date registerDate;


    //构造方法也是允许重载的.

    //空参构造 - 通过new关键字进行调用
    //如果一个实体类中,没有手动指定任何一个构造的时候,那么系统会默认分配一个空参构造
    public User(){
        //在未来,构建对象的时候,可以在此处进行一些预加载的任务,比如加载配置文件.
        System.out.println("User的空参构造被调用了.");
    }

    //带参构造 - 一旦这个实体类中提供了任何一个带参构造的时候,那么系统将不会再默认分配一个空参构造了.
    public User(int id){
        System.out.println("一参构造...");
        this.id = id;
    }

    //begin....this关键字的第二个作用
    public User(int id,String username){
        System.out.println("User - 两参构造...");
        this.id = id;
        this.username = username;
    }

    public User(int id,String username,String password){
        //本类中,使用this来调用其他构造方法.
        //注意点:必须出现在构造体的首行.
        //this();//调用本类中的空参构造...
        this(id,username);//ok

        System.out.println("User - 三参构造...");

        //this.id = id;
        //this.username = username;
        this.password = password;
    }

    //end....


    //全参构造
    public User(int id,String username,String password,Date registerDate){
        System.out.println("全参构造...");
        this.id = id;

        //构造方法中如果想要对参数进行有效性判断,推荐调用setter方法
        setUsername(username);

        this.password = password;
        this.registerDate = registerDate;
    }



    //提供getter/setter方法来供外界来调用和获取属性

    //setter方法的命名 - set+属性名[首字母变大写] -> 框架[反射技术] - 命名是一个约定.
    public void setId(int id){
        this.id = id;
    }

    //getter方法 - 取值
    //getter方法命名 - get+属性名[首字母大写]
    public int getId(){
        return id;
    }

    public void setUsername(String username) {
        //setter方法内部进行参数有效性判断
        //这个判断的业务逻辑对于外界是不可见的.
        if("习大大".equals(username)){
            this.username = "***";
            return;
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
       this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }
}
