package homework.Transport;

public class Transport {
    private String name;
    private String color;
    private int cost;
    private int speed;
    private int weight;

    public int travelTime(int distance){
        int travelTime = distance / this.speed;
        return travelTime;
    }




    public Transport(String name, String color, int cost, int speed, int weight) {
        this.name = name;
        this.color = color;

        this.cost = cost;
        this.speed = speed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
