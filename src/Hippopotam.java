public class Hippopotam extends Mammal{
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
}
