package tech.aistar.day12;

/**
 * 本类用来演示:枚举类型
 *
 * @author: success
 * @date: 2020/8/5 2:34 下午
 */
public enum EnumDemo3 {//默认继承的是java.lang.Enum抽象类

    //1. 每个枚举常量都是代表整个枚举类型的一个实例.
    SPRING("春天"){////背后等同于public final static EnumDemo SPRING = new EnumDemo();
        @Override
        public EnumDemo3 next() {
            return SUMMER;
        }
    },

    //如果定义多个枚举常量,使用逗号隔开
    SUMMER("夏天") {
        @Override
        public EnumDemo3 next() {
            return WINTER;
        }
    },//public final static EnumDemo SUMMER = new EnumDemo();

    WINTER("冬天") {
        @Override
        public EnumDemo3 next() {
            return SPRING;
        }
    };////public final static EnumDemo SUMMER = new EnumDemo("冬天");

    private EnumDemo3(String sign){
        this.sign = sign;
    }

    //2. 可以普通的属性
    private String sign;

    public String getSign(){
        return sign;
    }

    //4. 可以提供一个抽象方法 - 每个枚举实例都是要去重写这个抽象方法的
    public abstract EnumDemo3 next();
}
