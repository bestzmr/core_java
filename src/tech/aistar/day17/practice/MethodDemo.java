package tech.aistar.day17.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author: Merlin
 * @time: 2020/8/18 21:01
 */
public class MethodDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("tech.aistar.day17.Point");
            Method[] methods = c.getDeclaredMethods();
            System.out.println(methods.length);
            for (Method method : methods) {
                System.out.println(Modifier.toString(method.getModifiers()) + " ");
                System.out.println(method.getReturnType().getSimpleName() + " ");
                System.out.println(method.getName() + " ");
                Class<?>[] types = method.getParameterTypes();
                for (int i = 0; i < types.length; i++) {
                    System.out.println((i != types.length - 1) ? (types[i].getSimpleName() + ",") : (types[i].getSimpleName()));

                }
                System.out.println(")");
                System.out.println("====获取指定的方法====");
                Point p = (Point) c.newInstance();
                Method m1 = c.getDeclaredMethod("test");
                m1.invoke(p);
                Method m2 = c.getDeclaredMethod("test", int.class);
                m2.invoke(p, 100);

                Method m3 = c.getDeclaredMethod("test", int.class, String.class);
                m3.invoke(p, 200, "tom");
                Method m4 = c.getDeclaredMethod("testStatic");
                m4.invoke(null);
                Method m5 = c.getDeclaredMethod("testPrivate");
                m5.setAccessible(true);

                m5.invoke(p);

                Method m6 = c.getDeclaredMethod("getResult");
                String result = (String) m6.invoke(p);
                System.out.println(result);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
