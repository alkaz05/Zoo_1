public class Kenguru extends Animal {
    public Kenguru(String pocketSize) {
        super(pocketSize);
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
    public String makeSound() {
        return "кричит ARRRRRRR";
    }

    @Override
    public String jumping(jumping) {

    }
}
