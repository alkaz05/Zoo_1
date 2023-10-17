public class Kalibri extends Bird {
    int size_pecker;

    public Kalibri(String featherColor, int size_pecker) {
        super(featherColor);
        this.size_pecker = size_pecker;
    }
    @Override
    public String scream() {
        return "звук пьщей нектар птицы";
    }
    @Override
    public void move() {
        System.out.println("быстро летает,очень быстро!");
    }
    public Kalibri(String featherColor) {
        super(featherColor);
    }

}