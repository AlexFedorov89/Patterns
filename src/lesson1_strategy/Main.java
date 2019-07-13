package lesson1_strategy;

import lesson1_strategy.classes_ducks.Duck;
import lesson1_strategy.classes_ducks.MallardDuck;
import lesson1_strategy.classes_ducks.ModelDuck;
import lesson1_strategy.classes_ducks.RubberDuck;
import lesson1_strategy.fly.FlyOnRocket;

public class Main {
    public static void main(String[] args) {
        createDuckAndTest(new MallardDuck());
        createDuckAndTest(new RubberDuck());
        createModelDuckAndTest();

    }

    private static void createModelDuckAndTest() {
        Duck modelDuck = createDuckAndTest(new ModelDuck());
        modelDuck.setFlyBahavior(new FlyOnRocket());
        modelDuck.fly();
    }

    private static Duck createDuckAndTest(Duck duck) {
        duck.display();
        duck.fly();
        duck.swim();
        duck.quack();

        System.out.println();

        return duck;
    }
}
