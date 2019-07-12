package lesson1_strategy.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("кря-кря...кря");
    }
}
