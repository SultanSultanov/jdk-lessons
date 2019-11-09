package ferma_v2;

import ferma_v2.homeAnimal.Chicken;
import ferma_v2.homeAnimal.HomeAnimal;
import ferma_v2.wildAnimal.WildAnimal;

import java.util.Random;

public class Fermer {
    protected String nameFermer;
    protected int resFermer;
    protected boolean gonit = true;

    public Fermer(String nameFermer, int resFermer) {
        this.nameFermer = nameFermer;
        this.resFermer = resFermer;
    }

    public int getResFermer() {
        return resFermer;
    }

    public void setResFermer(int resFermer) {
        this.resFermer = resFermer;
    }

    public boolean isGonit() {
        return gonit;
    }

    public void setGonit(boolean gonit) {
        this.gonit = gonit;
    }

    public void CollectRes(HomeAnimal homeAnimal){
        this.resFermer += homeAnimal.getRes();

    }



}
