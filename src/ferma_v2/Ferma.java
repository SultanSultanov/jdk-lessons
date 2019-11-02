package ferma_v2;

import ferma_v2.wildAnimal.WildAnimal;

public class Ferma {
    Animal[] animals = new Animal[4];
    WildAnimal[] wildAnimals = new WildAnimal[3];
    Fermer[] fermers = new Fermer[1];

    public boolean addAnimals(Animal animal){
        for (int i = 0; i < this.animals.length; i++) {
            if (this.animals[i] == null){
                this.animals[i] = animal;
                return true;
            }
        }
        return false;
    }
    public boolean addWildAnimals(WildAnimal wildAnimal){    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.wildAnimals.length; i++) {
            if (this.wildAnimals[i] == null){
                this.wildAnimals[i] = wildAnimal;
                return true;
            }
        }
        return false;
    }
    public boolean addFermer(Fermer fermer){    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.fermers.length; i++) {
            if (this.fermers[i] == null){
                this.fermers[i] = fermer;
                return true;
            }
        }
        return false;
    }
    public void fermaDay(){

    }
}
