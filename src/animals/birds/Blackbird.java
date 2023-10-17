package animals.birds;

public class Blackbird extends Bird{
    public Blackbird(String featherColor) {
        super(featherColor);
    }

    public Blackbird(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public void move() {
        System.out.println("клюет зерна на траве");
    }

    @Override
    public String scream() {
        return "минорно поет";
    }
}
