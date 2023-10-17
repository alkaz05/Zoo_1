package animals.birds;

public class Sparrow extends Bird {

    public Sparrow() {
        super("Коричневый");
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
