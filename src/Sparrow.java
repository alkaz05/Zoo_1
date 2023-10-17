public class Sparrow extends Bird {

    public Sparrow(String featherColor) {
        super(featherColor);
    }

    @Override
    public void move() {
        System.out.println("Воробей скачет и летает");
    }

    @Override
    public String scream() {
        return "Чик-чирик";
    }
}
