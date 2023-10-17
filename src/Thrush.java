public class Thrush extends Bird{
    String beakColor;
    public Thrush(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
        beakColor = "рыжий";
    }

    public Thrush() {
        super("черный");
        beakColor = "рыжий";
    }

    @Override
    public void move() {
        System.out.println("Дрозд скачет и машет крыльями");
    }

    @Override
    public String scream() {
        return "Чирик!";
    }
}
