public class Crow extends Bird{
    public Crow(String featherColor) {
        super(featherColor);
    }

    public Crow(String name, String color) {
       super(name, 0, color);
    }

    @Override
    public String scream() {
        return "кар-кар";
    }

    @Override
    public void move() {
        System.out.println("ворона умеет летать, ходить и прыгать");
    }
}
