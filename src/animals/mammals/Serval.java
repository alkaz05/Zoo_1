package animals.mammals;

public class Serval extends Mammal {

        String breed;
    public Serval ( String name, double weight, String breed) {
            super(name, weight, false);
            this.breed = breed;
        }

    @Override
    public void move() {

    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
        };

    }

