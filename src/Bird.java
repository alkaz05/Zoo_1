abstract public class Bird extends Animal {
    String featherColor;

    public Bird(String featherColor) {
        //неявно вызывается super(), то есть конструктор базового класса без параметров
        this.featherColor = featherColor;
    }

    public Bird(String name, double weight, String featherColor) {
        super(name, weight); //явно вызывается коструктор базового класса с параметрами
        this.featherColor = featherColor;
    }

    public abstract String scream();

    @Override
    public String makeSound() {
        System.out.println(scream());
        return null;
    }
}
