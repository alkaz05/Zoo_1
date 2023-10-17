package animals.mammals;

import animals.IJumper;

public class Cat extends Mammal implements IJumper {
    String breed;
    public Cat ( String name, double weight, String breed) {
        super(name, weight, false);
        this.breed = breed;
    }


    @Override
    public void move() {
        jump();
    }

    @Override
    public void makeSound() {
        System.out.println( "[ХХ...ШШШШШШШШШШШ]");
        }

    @Override
    public void jump() {
        System.out.println("мягкий прыжок");
    }
}

