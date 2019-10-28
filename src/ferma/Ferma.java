package ferma;

import ferma.animal.*;
import ferma.fermer.Fermer;
import ferma.wildAnimal.Bear;
import ferma.wildAnimal.Fox;
import ferma.wildAnimal.WildAnimals;
import ferma.wildAnimal.Wolf;

public class Ferma {

        protected String name;
        protected int hp;
        protected int speed;
        protected int weight;
        protected int resouces;
        Fermer fermer;

        Animals[] animals;
        WildAnimals[] wildAnimals;

    public WildAnimals[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimals[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }

    public Animals[] getAnimals(int resouces) {
        return animals;
    }

    public void setAnimals(Animals[] animals) {
        this.animals = animals;
    }

    public void setFermer(Fermer fermer) {
        this.fermer = fermer;
    }

    public int getResouces() {
         return resouces;
     }

     public void setResouces(int resouces) {
         this.resouces = resouces;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getHp() {
         return hp;
     }

     public void setHp(int hp) {
         this.hp = hp;
     }

     public int getSpeed() {
         return speed;
     }

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public Ferma getFermer(int resouces) {
         return fermer;
     }






}
