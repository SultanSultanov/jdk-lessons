package homework.Transport;

public class Bike  extends Transport {
    public Bike(String name, String color, int cost, int speed, int weight) {
        super(name, color, cost, speed, weight);
    }

    private int CapacityPerson = 1;

    public Bike(String name, String color, int cost, int speed, int weight, int capacityPerson) {
        super(name, color, cost, speed, weight);
        CapacityPerson = capacityPerson;
    }
}
