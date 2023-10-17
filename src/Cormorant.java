public class Cormorant extends Bird {
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

}
