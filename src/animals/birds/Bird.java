package animals.birds;

import animals.Animal;

abstract public class Bird extends Animal {
    // класс Птица объявлен абстрактным, потому что у него
    // есть абстрактный метод "кричать" (каждая конкретная птица кричит по-своему)
    // Нельзя создать Птицу вообще, но можно будет создавать
    // каких-то конкретных (неабстрактных) птиц, то есть экземпляры классов-потомков
    String featherColor;

    public Bird(String featherColor) {
        //неявно вызывается super(), то есть конструктор базового класса без параметров
        this.featherColor = featherColor;
    }

    public Bird(String name, double weight, String featherColor) {
        super(name, weight); //явно вызывается коструктор базового класса с параметрами
        this.featherColor = featherColor;
    }

    public abstract String scream();
    //пометка "абстрактный" означает, что метод объявлен, но не описан

    @Override
    public void makeSound() {
        System.out.println(scream());

    }
}
