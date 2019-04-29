package strategymode.code.impl;

import strategymode.code.QuackBehavior;

/**
 * Created by Hhhh 2019-04-29 16:48
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱吱的叫.....");
    }
}
