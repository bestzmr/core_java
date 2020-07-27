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
