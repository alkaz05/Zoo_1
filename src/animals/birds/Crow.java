package animals.birds;

import animals.IFlyer;
import animals.IJumper;

public class Crow extends Bird implements IJumper, IFlyer {
    //ворона это класс, который наследует классу Птица и умеет летать и прыгать
    public Crow(String featherColor) {
        super(featherColor);
    }

    public Crow(String name, String color) {
       super(name, 0, color);
    }

    @Override
    public String scream() {
        return "кар-кар";
    }

    @Override
    public void move() {
        System.out.println("ворона умеет летать, ходить и прыгать");
    }

    public void jump()
    {
        System.out.println("небольшой прыг");
    }

    @Override
    public void takeOff(String from) {
        System.out.println(getName()+", хлопая крыльями, взлетает из "+from);
    }

    @Override
    public void land(String to) {
        System.out.println(getName()+" приземляется в "+to+" на лапы");
    }

    @Override
    public void flyStraight(String from, String to) {
        System.out.println(getName()+" летит быстро-быстро из "+from+" в "+to);
    }
}
