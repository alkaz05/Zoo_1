package animals.birds;

import animals.IFlyer;

public class Woodpecker extends Bird implements IFlyer {
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

    @Override
    public void takeOff(String from) {
        System.out.println(getName()+" взлетает");
    }

    @Override
    public void land(String to) {
        System.out.println(getName()+" садится и стучит");
    }

    @Override
    public void flyStraight(String from, String to) {
        System.out.println(getName()+" летит синусоидально");
    }
}
