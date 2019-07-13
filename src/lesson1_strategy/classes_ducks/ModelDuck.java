package lesson1_strategy.classes_ducks;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("я модель утки");
    }

    @Override
    public void swim() {
        System.out.println("я не умеею плавать");
    }
}
