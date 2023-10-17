package transport;

import animals.IDiver;

public class Submarine implements IDiver {
    @Override
    public void dive() {
        System.out.println("Начинаем погружение");
    }
}
