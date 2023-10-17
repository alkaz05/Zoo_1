package animals.birds;

public class Penguin extends Bird{
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
}
