package animals.birds;

public class Kiwi extends Bird{ //Светлана
    public Kiwi(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public void move() {
        System.out.println("Киви умеет ходить и прыгать");
    }

    @Override
    public String scream() {
        return "кии-ви-кии-ви";
    }
}
