package lesson1_strategy.fly;

public class FlyNoWay implements FlyBahavior{

    @Override
    public void fly() {
        System.out.println("я не умею летать!");
    }
}
