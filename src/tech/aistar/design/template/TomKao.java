package tech.aistar.design.template;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 10:24 上午
 */
public class TomKao extends PaperTemplate{
    @Override
    public String answer01() {
        return "A";
    }

    @Override
    public String answer02() {
        return "B";
    }
}

class Adminkao extends PaperTemplate{

    @Override
    public String answer01() {
        return "C";
    }

    @Override
    public String answer02() {
        return "D";
    }
}

class TestPaper{
    public static void main(String[] args) {
        PaperTemplate t1 = new TomKao();
        t1.kao();

        System.out.println("[---]");

        PaperTemplate t2 = new Adminkao();
        t2.kao();
    }
}