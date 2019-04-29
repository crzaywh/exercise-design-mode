package strategymode.code.impl;

import strategymode.code.FlyBehavior;

/**
 * Created by  Hhhh 2019-04-29 16:44
 */
public class FlyNothing implements FlyBehavior {

    public void fly() {
        System.out.println("不会飞行....");
    }
}
