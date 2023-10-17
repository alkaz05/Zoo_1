public class Bear extends Animal{
    public Bear() {
    }

    public Bear(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void makeSound(){System.out.println("Рычит");}
    @Override
    public void move(){System.out.println("ходить и прыгать");}

}
