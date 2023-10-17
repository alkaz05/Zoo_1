public class Serval extends Animal {

        String breed;
    public Serval ( String name, double weight, String breed) {
            super(name, weight);
            this.breed = breed;
        }

    @Override
    public void move() {

    }

    @Override
    public String makeSound() {    return "[ХХ...ШШШШШШШШШШШ]";
        };

    }

