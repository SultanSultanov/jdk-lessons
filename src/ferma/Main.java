package ferma;

import ferma.animal.*;
import ferma.fermer.Fermer;
import ferma.wildAnimal.Bear;
import ferma.wildAnimal.Fox;
import ferma.wildAnimal.WildAnimals;
import ferma.wildAnimal.Wolf;

public class Main {
    public static void main(String[] args) {

        Fermer fermer = new Fermer("Vova", 30);


        Cat cat = new Cat("Vasya", 40, 20);
        Chicken chicken = new Chicken("koko", 5, 20, 20, 5);
        Cow cow = new Cow("Murka", 100, 10, 50, 10);
        Rabbit rabbit = new Rabbit("Pushok", 10, 30, 20);


        Wolf wolf = new Wolf("Bobik", 30, 15, 5);
        Fox fox = new Fox("Lisa", 20, 20, 5);
        Bear bear = new Bear("Misha", 100, 10, 40);


        Animals[] animals = new Animals[3];
        animals[0] = cat;
        animals[1] = chicken;
        animals[2] = cow;

        WildAnimals[] wildAnimals = new WildAnimals[3];
        wildAnimals[0] = wolf;
        wildAnimals[1] = fox;
        wildAnimals[2] = bear;


        Ferma ferma = new Ferma();
        ferma.setFermer(fermer);
        ferma.setAnimals(animals);
        ferma.setWildAnimals(wildAnimals);





        for (int i = 1; fermer.resouces > 0; i++) {
            System.out.println("День " + i);
            fermer.resouces = fermer.resouces - 5;

        }

    }
}
