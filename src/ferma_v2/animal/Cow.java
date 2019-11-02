package ferma_v2.animal;

import ferma_v2.Animal;

public class Cow extends HomeAnimal implements GivRes {
    private int maxResCow = 10;
    private int res;

    public Cow(String name, int weight, int speed, int hp) {
        super(name, weight, speed,hp);
    }

    public int getMaxResCow() {
        return maxResCow;
    }

    public void setMaxRes(int maxRes) {
        this.maxResCow = maxRes;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        if (res < 0 ) return;
        this.res = res;
    }


}
