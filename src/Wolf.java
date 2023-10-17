public class Wolf extends Mammal {

    private boolean isFeral;

    public Wolf(String name, double weight,boolean isFeral ) {
        super(name, weight, true);
        this.isFeral=isFeral;
    }

    @Override
    public void move() {
        System.out.println("Волк бежит");
    }

    private String howl(){
        return "Ауууууууууу";
    }

    @Override
    public void makeSound() {
        this.howl();

    }

    @Override
    public String getName(){
        String s = new String();
        if (this.isFeral)
            s= "Это дикий ";
        else
            s="Это домашний ";
        return s +getName();
    }

}
