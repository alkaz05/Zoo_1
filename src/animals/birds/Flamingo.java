package animals.birds;

import animals.ISwimmer;

public class Flamingo extends Bird implements ISwimmer {

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
        System.out.println("фламинго важно ходит по водоему");
    }

    @Override
    public String scream() {
        return "кричит как фламинго, привлекая внимание";
    }

    @Override
    public void swim() { System.out.println("плывет по поверхности воды");

    }
}
