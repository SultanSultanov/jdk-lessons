package ferma_v2;

import ferma_v2.animal.Cat;
import ferma_v2.animal.Chicken;
import ferma_v2.animal.Cow;
import ferma_v2.animal.Rabbit;
import ferma_v2.wildAnimal.Bear;
import ferma_v2.wildAnimal.Fox;
import ferma_v2.wildAnimal.Wolf;

public class Main {
    public static void main(String[] args) {
        Fermer fermer = new Fermer("Kolia",50);
        
        Cat cat = new Cat("Vasiy", 5,20,30);
        Chicken chicken = new Chicken("Koko", 5,10,7);
        Cow cow = new Cow("Mymy", 20,5,40);
        Rabbit rabbit = new Rabbit("Pushok", 5,20,15);

        chicken.setRes(5);
        cow.setRes(10);

        Bear bear = new Bear("Misha", 70,20,5);
        Fox fox = new Fox("Lisa", 20,20,2);
        Wolf wolf = new Wolf("Volodia", 25,17,4);
        
        Ferma ferma = new Ferma();
        ferma.addAnimals(cat);
        ferma.addAnimals(chicken);
        ferma.addAnimals(cow);
        ferma.addAnimals(rabbit);

        ferma.addWildAnimals(bear);
        ferma.addWildAnimals(fox);
        ferma.addWildAnimals(wolf);

        ferma.addFermer(fermer);






    }
}
