package strategymode.code;

/**
 * Created by Hhhh 2019-04-29 16:38
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void swim();

    abstract void display();

    protected void performceFly(){
        flyBehavior.fly();
    }

    protected void performQuack(){
        quackBehavior.quack();
    }
}
