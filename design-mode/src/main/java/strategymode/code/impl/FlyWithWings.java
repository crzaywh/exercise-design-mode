package strategymode.code.impl;

import strategymode.code.FlyBehavior;

/**
 * Created by  Hhhh 2019-04-29 16:45
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("嘎嘎的飞.....");
    }
}
