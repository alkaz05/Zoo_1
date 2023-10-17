public abstract class Animal {
    private double weight;
    private String name;

    public Animal() {
    }

    public Animal( String name, double weight) {
        setWeight(weight);
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight>0)
            this.weight = weight;
    }

    public abstract void move();

    public abstract void makeSound();

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}
