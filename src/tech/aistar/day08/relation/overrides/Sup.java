package tech.aistar.day08.relation.overrides;

import tech.aistar.day08.relation.extend.Animal;
import tech.aistar.day08.relation.extend.Dog;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 4:07 下午
 */
public class Sup {

    public Animal buy(){
        return null;
    }

    public double test(){
        return 0.0;
    }
}

class Sub extends Sup{
    @Override
    public Dog buy() {
        return null;
    }

    @Override
    public double test() {
        return super.test();
    }
}
