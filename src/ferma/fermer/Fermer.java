package ferma.fermer;

import ferma.Ferma;
import ferma.animal.Animals;

public class Fermer extends Ferma  {
    public Fermer(String name, int resources) {

    }

    public void takeResources(Animals animals){ // фермер собирает ресурсы
        this.resouces += animals.getResouces();

    }
    public void feedAnimals(Animals animals){
        this.hp++;
    }




}
