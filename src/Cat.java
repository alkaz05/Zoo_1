public class Cat extends Mammal{
    String breed;
    public Cat ( String name, double weight, String breed) {
        super(name, weight, false);
        this.breed = breed;
    }


    @Override
    public void move() {

    }

    @Override
    public void makeSound() {
        System.out.println( "[ХХ...ШШШШШШШШШШШ]");
        }
    }

