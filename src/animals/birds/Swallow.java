package animals.birds;

public class Swallow extends Bird {
    public Swallow(String featherColor) {
        super(featherColor);
    }
    public Swallow(String name, String color) {
        super(name,0,color);
    }
    //@Override
    public String scream() {
        return "фью фью";
    }
    //@Override
    public void move() {
        System.out.println("ласточка умеет летать и прыгать");
    }
}