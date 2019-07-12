package lesson1_strategy.classes_ducks;

import lesson1_strategy.fly.FlyWithWings;
import lesson1_strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBahavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("я дикая утка");
    }
}
