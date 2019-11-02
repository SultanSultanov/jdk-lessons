package ferma_v2.animal;

import ferma_v2.Animal;

public class Chicken extends HomeAnimal implements GivRes {
    private int res;
    private int maxResChicken = 5;
    public Chicken(String name, int weight, int speed, int hp ) {
        super(name, weight, speed, hp);
    }

    public int getRes() {
        return maxResChicken;
    }

    public void setRes(int res) {
        if (res < 0 ) return;
            this.res = res;
    }


    public int getMaxResChicken() {
        return maxResChicken;
    }

    public void setMaxResChicken(int maxResChicken) {
        this.maxResChicken = maxResChicken;
    }

}
