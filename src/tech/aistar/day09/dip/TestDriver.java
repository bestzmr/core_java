package tech.aistar.day09.dip;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 10:02 上午
 */
public class TestDriver {
    public static void main(String[] args) {
//        Driver driver = new Driver();
//
//        AoDi aoDi = new AoDi();
//        //driver.driverAoDiRun(aoDi);
//
//        BaoMa baoMa = new BaoMa();
//        driver.driverBaoMa(baoMa);
//
//        //突然司机又有钱了 - 换飞机...
//        //掌握一项新的技能 - 需求更改了,拓展了.
//
//        Plane p = new Plane();

        Driver driver = new Driver();

        CarSup c1 = new AoDi();

        CarSup c2 = new BaoMa();

        driver.driverCar(c1);
        driver.driverCar(c2);

        //掌握了新的技能
        CarSup c3 = new BSJ();
        driver.driverCar(c3);



    }
}
