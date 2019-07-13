package lesson1_strategy.fly;

public class FlyOnRocket implements FlyBahavior {
    @Override
    public void fly() {
        System.out.println("полетели на ракете");
    }
}
