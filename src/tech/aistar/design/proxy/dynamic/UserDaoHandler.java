package tech.aistar.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 本类用来演示: 相当相当重要 - mybatis框架的时候 - Mapper代理开发方式的时候(底层)
 *
 * @author: success
 * @date: 2020/8/18 2:48 下午
 */
public class UserDaoHandler implements InvocationHandler {

    //被代理的对象 - 目标对象
    private Object obj;

    public UserDaoHandler(Object obj){
        this.obj = obj;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method
     *        比如调用add方法 - add方法对应Method对象
     *        比如调用test方法 - test方法对应的Method对象.
     *
     * @param args 比如调用add方法需要传入的参数.
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        if(method.getName().startsWith("remove")){
//            throw new UnsupportedOperationException("不支持的操作!");
//        }

        System.out.println("log之前...");

        //反射调用目标对象中的方法
        method.invoke(obj,args);//核心的业务方法的...

        System.out.println("log之后...");
        return null;
    }
}
