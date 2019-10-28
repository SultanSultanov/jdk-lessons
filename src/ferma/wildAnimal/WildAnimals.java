package ferma.wildAnimal;

import ferma.animal.Animals;

public class WildAnimals extends Animals {
    protected String name;
    protected int weight;
    protected int speed;
    protected int streight;



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStreight() {
        return streight;
    }

    public void setStreight(int streight) {
        this.streight = streight;
    }
}
