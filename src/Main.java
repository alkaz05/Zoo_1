import animals.IFlyer;
import animals.birds.*;
import animals.mammals.Wolf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //exampleBirs0();
        //exampleBirs1();
        exampleInterface1();

    }

    private static void exampleInterface1() {
        Crow cr = new Crow("Кагги-кар", "черный");
        cr.moveByAir("Изумрудный город", "Канзас");
        Wolf toto = new Wolf("Тотошка",2, false);
        //вызовем метод, передав конкретный объект
        sendMessage(cr, "Канзас", "Изумрудный город", "hello world!");

        //вызовем метод, передавая новый объект
        sendMessage(new Woodpecker("зеленый"), "пункт А", "пункт Б", "всем привет");
        //вызовем метод, передавая объект анонимного вложенного класса. реализующего интерфейс
        sendMessage(new IFlyer() {
            @Override
            public void takeOff(String from) {
                System.out.println("взлет");
            }

            @Override
            public void land(String to) {
                System.out.println("посадка");
            }

            @Override
            public void flyStraight(String from, String to) {
                System.out.println("полет");
            }
        }, "B", "C", "message");
    }

    private static void exampleBirs1() {
        Bird[] birds = new Bird[]{
                        new Thrush(),
                        new Flamingo("Дульсинея",2,"розовый", 1, 1.2),
                        new Perrot("Кеша", 0.3, "зелёный"),
                        new Kalibri("красный"),
                        new Swallow("Лина","черный")
        };
        System.out.println(Arrays.toString(birds));
    }

    private static void exampleBirs0() {
        //animals.birds.Bird b = new animals.birds.Bird("blue") ;
        Bird cr = new Crow("белая");
        System.out.println(cr.getClass());
        System.out.println(cr.getClass().getSuperclass());


        Bird[] birds = new Bird[5];
        birds[0] = cr;
        birds[1] = new Penguin();
        birds[2] = new Crow("зеленая");
        birds[3] = new Crow("серая");
        birds[4] = new Perrot("Яга", 3, "синий");

        for (int i = 0; i < birds.length; i++) {
            birds[i].makeSound();
        }
    }

    //обычный метод, но в качестве одного из параметров выступает
    //объект любого класса, реализующего интерфейс IFlyer
    private static void sendMessage(IFlyer x, String from, String to, String msg)
    {
        System.out.println("------------------------------");
        System.out.println("пишем "+msg+" на бумаге");
        System.out.println("прикрепляем бумагу к "+x);
        x.moveByAir(from, to);
        System.out.println("читаем сообщение: "+msg);
        System.out.println("------------------------------");
    }
}