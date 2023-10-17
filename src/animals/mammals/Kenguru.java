package animals.mammals;

import animals.Animal;

public class Kenguru extends Animal {
    public Kenguru(String pocketSize) {

    }

    /**
     *
     */
    @Override
    public void move() {
        System.out.println("Кенгуру отлично дерется и прыгает");
    }

    /**
     * @return
     */
    @Override
    public void makeSound() {
        System.out.println( "кричит ARRRRRRR");
    }


}
