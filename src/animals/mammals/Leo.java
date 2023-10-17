package animals.mammals;

import animals.Animal;

public abstract class Leo extends Animal {
int weight = 150;
int paws = 4;
    String name = "Gerald";
    void displayInfo(){
        System.out.println(name);
    }

    public Leo(String name, double weight, int weight1, int paws, String name1) {
        super(name, weight);
        this.weight = weight1;
        this.paws = paws;
        this.name = name1;
    }
    @Override
    public abstract void move();
    @Override
    public abstract void makeSound();
}
