public class Flamingo extends Bird{

    int age;
    double height;


    public Flamingo(String featherColor, int age, double height) {
        super(featherColor);
        this.age = age;
        this.height = height;
    }

    public Flamingo(String name, double weight, String featherColor, int age, double height) {
        super(name, weight, featherColor);
        this.age = age;
        this.height = height;
    }

    @Override
    public void move() {

    }

    @Override
    public String scream() {
        return null;
    }
}
