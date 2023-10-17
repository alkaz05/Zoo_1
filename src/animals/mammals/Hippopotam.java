package animals.mammals;

import animals.ISwimmer;

public class Hippopotam extends Mammal implements ISwimmer {
    double weight;
    double speed;

    public Hippopotam(String name, double weight, double speed) {
        super(name, weight, true);
        this.speed = speed;
    }
    @Override
    public void move() {
        System.out.println("бегемоты быстро бегают и умеют плавать");
    }

    @Override
    public void makeSound() {
        System.out.println("бегемот громко чавкает");
    }


    @Override
    public void swim() { System.out.println("бултых и поплыл"); }
}
