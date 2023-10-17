public class Capybara extends Mammal{
    public Capybara(String name, double weight, boolean isInPack) {
        super(name, weight, isInPack);
    }

    @Override
    public void move() {
        System.out.println("ходит прыгает и павает");
    }

    @Override
    public void makeSound() {
        System.out.println("Издает звук свиста и стрекотание");
    }

}
