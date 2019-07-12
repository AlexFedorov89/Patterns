package lesson1_strategy;

import lesson1_strategy.classes_ducks.MallardDuck;
import lesson1_strategy.classes_ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.swim();
        mallardDuck.quack();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.quack();


    }
}
