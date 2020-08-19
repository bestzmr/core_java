package tech.aistar.day17.anno.extend;

import java.lang.annotation.*;

/**
 * 本类用来演示: 让子类可以继承父类注解
 *
 * @author: success
 * @date: 2020/8/19 8:45 上午
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited // 注解的继承性
public @interface Select {
    String value();
}
