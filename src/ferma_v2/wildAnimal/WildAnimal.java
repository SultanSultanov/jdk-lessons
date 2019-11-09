package ferma_v2.wildAnimal;

import ferma_v2.HomeAnimal;

public class WildAnimal extends HomeAnimal {
    protected int dmg;

    public WildAnimal(String name, int weight, int speed, int dmg) {
        super(name, weight, speed);
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }





}
