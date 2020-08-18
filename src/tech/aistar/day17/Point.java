package tech.aistar.day17;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 8:48 上午
 */
public class Point {
    //私有的属性
    //私有的2
    private int x;

    private String y;

//    int m;//默认的是0
//
//    //受保护的是4
//    protected int n;
//
//    //公开的是1
//    public int z;

    public Point(){
        System.out.println("Point空参构造...");
    }

    /**
     * 多参构造
     * @param x
     */
    public Point(int x,String y){
        System.out.println("x:"+x+",y:"+y);
    }

    public void test(){
        System.out.println("test()...");
    }

    public void test(int x){
        System.out.println("x:"+x);
    }

    public void test(int x,String y){
        System.out.println("x:"+x+",y:"+y);
    }

    public static void testStatic(){
        System.out.println("static...");
    }

    private void testPrivate(){
        System.out.println("private...");
    }

    public String getResult(){
        return "ok";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y='").append(y).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
