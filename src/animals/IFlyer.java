package animals;

public interface IFlyer {
    void takeOff(String from);
    void land(String to);
    void flyStraight(String from, String to);
    default void moveByAir(String from, String to){
        takeOff(from);
        flyStraight(from, to);
        land(to);
    }
}
