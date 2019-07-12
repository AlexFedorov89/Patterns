package lesson1_strategy.classes_ducks;

import lesson1_strategy.fly.FlyNoWay;
import lesson1_strategy.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBahavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("я резиновая уточка");
    }
}
