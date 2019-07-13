package lesson1_strategy.classes_ducks;

import lesson1_strategy.fly.FlyBahavior;
import lesson1_strategy.quack.QuackBehavior;

public abstract class Duck {

    FlyBahavior flyBahavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("все утки умеют плавать");
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

    public void setFlyBahavior(FlyBahavior flyBahavior) {
        this.flyBahavior = flyBahavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
