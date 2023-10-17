public class Woodpecker extends Bird {
    public Woodpecker(String name, String colorCap) {
        super(name, 0, colorCap);
    }

    public Woodpecker(String featherColor) {
        super(featherColor);
    }

    public Woodpecker(String name, double weight, String featherColor) {
        super(name, weight, featherColor);
    }

    @Override
    public String scream() {
        return "Тук-тук-тук";
    }

    /**
     *
     */
    @Override
    public void move()  {
        System.out.println("Дятел в красной шапочке может летать и стучать  ");
    }

    }
