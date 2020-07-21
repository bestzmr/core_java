package tech.aistar.day04;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/21 3:43 下午
 */
public class SwtichCaseDemo {
    public static void main(String[] args) {
        //[90 - 100] - 优秀
        //[80 - 90) - 良好

        int score = 98;

        int n = score / 10;
        switch (n){
            case 9:
            case 10:
                System.out.println("优秀!");
                break;
            case 8:
                System.out.println("良好");
                break;
            default:
                System.out.println("好好努力!");
                break;
        }
    }
}
