//by lunaro-4:
public abstract class Mammal extends Animal {
    private boolean isInPack;


    public Mammal( String name, double weight,boolean isInPack ) {
        setWeight(weight);
        this.setName(name);
        this.isInPack = isInPack;
    }

}
