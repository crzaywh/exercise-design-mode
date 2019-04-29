package strategymode.code;

/**
 * 策略模式
 * Created by  Hhhh 2019-04-29 16:54
 * <p>
 * MallardDuck：内部现在是通过构造器实现的
 * MallardDuck：添加set方法，将实例传入，实现动态化
 * Spring内部：同过注入的形式，类型名称不一样，则找的对应的实现也是不一样的
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performceFly();
        mallardDuck.performQuack();
    }
}
