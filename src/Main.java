import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //exampleBirs0();
        exampleBirs1();

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
        //Bird b = new Bird("blue") ;
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
}