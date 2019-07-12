package lesson1_strategy.fly;

public class FlyWithWings implements FlyBahavior {
    @Override
    public void fly() {
        System.out.println("я умею летать");
    }
}
