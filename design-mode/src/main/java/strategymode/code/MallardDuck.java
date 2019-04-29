package strategymode.code;

import strategymode.code.impl.FlyWithWings;
import strategymode.code.impl.QuackNothing;

/**
 * Created by  Hhhh 2019-04-29 16:52
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new QuackNothing();
        flyBehavior = new FlyWithWings();
    }

    void swim() {
        System.out.println("swim.....");
    }

    void display() {
        System.out.println("我是鸭....");
    }
}
