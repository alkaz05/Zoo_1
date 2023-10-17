package animals.birds;

import animals.IDiver;
import animals.IJumper;

public class Penguin extends Bird implements IJumper, IDiver {
    public Penguin() {
        super("черно-белый");
    }

    public Penguin(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public void move() {
        System.out.println("пингвины отлично плавают и ныряют");
    }

    @Override
    public String scream() {
        return "кричит по-пингвиньему";
    }

    @Override
    public void jump() {
        System.out.println("пингвины очень хорошо прыгают");
    }

    @Override
    public void dive() {
        System.out.println("буль-буль");
    }
}
