package ferma_v2;

import ferma_v2.wildAnimal.WildAnimal;

import java.util.Random;

public class Ferma {

    protected HomeAnimal[] homeAnimals = new HomeAnimal[4];
    protected WildAnimal[] wildAnimals = new WildAnimal[3];
    protected Fermer[] fermer = new Fermer[1];

    public boolean addHomeAnimals(HomeAnimal homeAnimal) {    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.homeAnimals.length; i++) {
            if (this.homeAnimals[i] == null) {
                this.homeAnimals[i] = homeAnimal;
                return true;
            }
        }
        return false;
    }

    public boolean addFermer(Fermer fermer) {    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.fermer.length; i++) {
            if (this.fermer[i] == null) {
                this.fermer[i] = fermer;
                return true;
            }
        }
        return false;
    }

    public boolean addWildAnimals(WildAnimal wildAnimal) {    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.wildAnimals.length; i++) {
            if (this.wildAnimals[i] == null) {
                this.wildAnimals[i] = wildAnimal;
                return true;
            }
        }
        return false;
    }

    public WildAnimal getRandomWildAnimal(WildAnimal[] wildAnimals) {
        Random rand = new Random();
        return wildAnimals[rand.nextInt(wildAnimals.length)];
    }

    public HomeAnimal getRandomHomeAnimal(HomeAnimal[] homeAnimals){
        Random rand = new Random();
        return homeAnimals[rand.nextInt(homeAnimals.length)];
    }

    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }















    public HomeAnimal[] getHomeAnimals() {
        return homeAnimals;
    }

    public void setHomeAnimals(HomeAnimal[] homeAnimals) {
        this.homeAnimals = homeAnimals;
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimal[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }

    public Fermer[] getFermer() {
        return fermer;
    }

    public void setFermer(Fermer[] fermer) {
        this.fermer = fermer;
    }
}

