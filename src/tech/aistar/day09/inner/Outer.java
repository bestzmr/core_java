package tech.aistar.day09.inner;

/**
 * 本类用来演示:外部类
 *
 * @author: success
 * @date: 2020/7/30 10:23 上午
 */
public class Outer {

    private int id = 1;

    private static int guid = 2;

    //1. 成员内部类 - 内部类作为外部类的一个成员存在
    public class MemberInner{
        //定义一个普通属性
        private int id = 100;//故意和外部类的属性id名称一致的.

        //成员内部类是不允许定义静态的属性的
        //private static int guid = 200;

        //定义普通方法
        public void test(){
            //访问内部类自己的id
            //1. 如果内部类和外部类有同名的id的时候,访问的就是内部类 - "就近原则"
            //2. 如果只有外部类拥有id,此处访问的就是外部类的id
            System.out.println("内部类id:"+id);

            //访问外部类的同名的id
            System.out.println("外部类id:"+Outer.this.id);

            //访问外部类的静态属性guid
            System.out.println("外部类guid:"+Outer.guid);
            System.out.println("外部类guid:"+guid);
        }
    }

    //外部类中提供一个方法用来返回这个内部类对象
    public MemberInner createMemberInner(){
        return new MemberInner();
    }

    //2. 静态内部类
    public static class staticInner{
        private int id = 100;

        private static int guid = 200;

        public void test(){
            System.out.println("内部类id:"+id);//就近原则.

            //不能访问外部类中的非静态属性
            //System.out.println("外部类id:"+Outer.this.id);

            //外部类的guid
            System.out.println("外部类guid:"+Outer.guid);

            //内部类的guid
            System.out.println("内部类guid:"+guid);
        }
    }

    //3. 局部内部类
    public void testLocalInner(){
        //局部内部类的作用域就只能改方法内部被使用..
        class LocalInner{
            private int id = 100;

            //private static int guid = 200;//error

            public void test(){
                System.out.println("内部类id:"+id);
                System.out.println("外部类id:"+Outer.this.id);

                System.out.println("外部类guid:"+guid);
                System.out.println("外部类guid:"+Outer.guid);
            }
        }

        //只能在方法体中去创建这个局部内部类对象
        LocalInner localInner = new LocalInner();
        localInner.test();
    }
}
