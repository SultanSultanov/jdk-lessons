package ferma_v2.animal;

import ferma_v2.Animal;

public class HomeAnimal extends Animal {
    private int hp;


    public HomeAnimal(String name, int weight, int speed, int hp) {
        super(name, weight, speed);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) return;
        this.hp = hp;
    }
}
