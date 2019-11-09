package ferma_v2.homeAnimal;

import ferma_v2.Fermer;

public class HomeAnimal extends ferma_v2.HomeAnimal {
    protected int hp;
    protected int res;

    public HomeAnimal(String name, int weight, int speed, int hp, int res) {
        super(name, weight, speed);
        this.hp = hp;
        this.res = res;
    }

    public void Kormlenie(){
        setHp(getHp() + 1) ;
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}



