package tech.aistar.design.singleton.enums;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 3:44 下午
 */
public class Singleton08 {

   static enum EnumDemo{

       INSTANCE;

        private Singleton08 singleton08;

        private EnumDemo(){
            singleton08 = new Singleton08();
        }

        public Singleton08 getInstance(){
            return singleton08;
        }
    }

    public static EnumDemo getInstance(){
       return EnumDemo.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton08 s1 = Singleton08.getInstance().getInstance();
        Singleton08 s2 = Singleton08.getInstance().getInstance();
        System.out.println(s1 == s2);
    }
}
