package tech.aistar.day17.anno;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 4:08 下午
 */
//@MyAnno(value1 = "tom", name = "python") //value是默认的属性名称,可以省略不写.前提是只有单个属性存储.

@MyAnno(value={"java","python"})
public class TestMyAnno {
   
    //@MyAnno(value1 = "java", name = "php")

    @MyAnno(value = {"java2","python2"})
    public void test(){
        System.out.println("test...");
    }
}
