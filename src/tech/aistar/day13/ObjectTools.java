package tech.aistar.day13;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 9:51 上午
 */
public class ObjectTools<T> {

    public T get(T t){
        return t;
    }

    //没有泛型的时候 - 都是使用object类型
    public Object find(Object obj){
        return obj;
    }
}
class TestTools{
    public static void main(String[] args) {
        ObjectTools<String> tools = new ObjectTools<>();

        String result01 = tools.get("ok");

        //编译期间一旦不会出现问题,程序运行期间就不会抛出类型转换失败的异常.
        //Integer tt = tools.get("ok");

        System.out.println(result01);

        ObjectTools<Integer> tools1 = new ObjectTools<>();
        Integer result02 = tools1.get(100);
        System.out.println(result02);

        ObjectTools t = new ObjectTools();

        //编译期间是正常的,但是运行期间存在类型转换失败的风险
        Integer s = (Integer) t.find("ok");
        System.out.println(s);
    }
}
