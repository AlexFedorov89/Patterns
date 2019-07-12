package lesson1_strategy.classes_ducks;

import lesson1_strategy.fly.FlyBahavior;
import lesson1_strategy.quack.QuackBehavior;

public class Duck {

    protected FlyBahavior flyBahavior;
    protected QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("я умею плавать");
    }

    public void fly(){
        if (flyBahavior == null){
            System.out.println("я не знаю умею ли я летать");

            return;
        }

        flyBahavior.fly();
    }

    public void quack(){
        if (quackBehavior == null){
            System.out.println("я не знаю умею ли я крякать");

            return;
        }

        quackBehavior.quack();
    }

    public void display(){
        System.out.println("я обычная уточка");
    }
}
