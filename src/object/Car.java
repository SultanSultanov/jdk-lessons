package object;

import java.util.Objects;

public class Car implements Cloneable{
    private String brand;
    private String color;
    private Owner owner;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //реализация
        return super.clone();
    }

    public Car(String brand, String color, Owner owner) {
        setBrand(brand);
        setColor(color);
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // TODO: проверка входящий данных
        this.brand = brand;
    }

    public String getColor() {

        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(color, car.color) &&
                Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, owner);
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
