public class Wolf extends Animal {


    @Override
    public void move() {

    }

    private String howl(){
        return "Ауууууууууу";
    }

    @Override
    public String makeSound() {
        this.howl();
        return null;
    }
}
