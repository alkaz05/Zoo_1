public class Woodpecker extends Bird {
    public Crow(String name, String colorCap) {
        super(name, 0, colorCap);
    }

    @Override
    public String scream() {
        return "Тук-тук-тук";
    }
}