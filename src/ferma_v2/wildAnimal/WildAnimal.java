package ferma_v2.wildAnimal;

import ferma_v2.Animal;

public class WildAnimal extends Animal {
    private int dmg;
    public WildAnimal(String name, int weight, int speed, int dmg) {
        super(name, weight, speed);
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        if (dmg < 0) return;
        this.dmg = dmg;
    }
}
