package animals.mammals;

import animals.Animal;
import animals.IJumper;

public class Kenguru extends Mammal implements IJumper {
    public Kenguru(String pocketSize) {
        super("", 0, false);
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

    @Override
    public void jump()
    {
        System.out.println("гигантский прыг");
    }

}
