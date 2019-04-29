package strategymode.code.impl;

import strategymode.code.QuackBehavior;

/**
 * Created by  Hhhh 2019-04-29 16:47
 */
public class QuackNothing implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫......");
    }
}
