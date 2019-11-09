package ferma_v2;

public class HomeAnimal {
    protected String name;
   protected int weight;
   protected int speed;
   int hp;


    public HomeAnimal(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
