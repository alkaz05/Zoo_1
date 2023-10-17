package animals.birds;

import animals.IDiver;

public class Cormorant extends Bird implements IDiver {
    public Cormorant(String featherColor) {
        super(featherColor);
    }

    public Cormorant(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }
    @Override
    public String scream(){return "кар-кар по баклански";}

    @Override
    public void move() {System.out.println("баклан умеет летать, ходить и прыгать ");}

    @Override
    public void dive() {
        System.out.println("буль-буль-буль");
    }
}
