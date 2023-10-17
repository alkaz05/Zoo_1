public class Main {
    public static void main(String[] args) {
        //Bird b = new Bird("blue") ;
        Bird cr = new Crow("белая");
        System.out.println(cr.getClass());
        System.out.println(cr.getClass().getSuperclass());

        Bird[] birds = new Bird[4];
        birds[0] = cr;
        birds[1] = new Penguin();
        birds[2] = new Crow("зеленая");
        birds[3] = new Crow("серая");

        for (int i = 0; i < birds.length; i++) {
            birds[i].makeSound();
        }
    }
}