public class Elephant extends Animal{
        int height;
     String color;
    public Elephant(int height, String color) {
        setHeight(height);
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void move() {
        System.out.println("раскачивыается на ходу");
    }

    @Override
    public void makeSound() {
        System.out.println("протяжно трубит");
    }
}
