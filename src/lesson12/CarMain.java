package lesson12;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class CarMain {
    public static void main(String[] args) {
        // модель . price . color
        Car opel1 = new Car("black", "opel", 2000);
        Car opel2 = new Car("red", "opel", 2500);
        Car mazda1 = new Car("yellow", "mazda", 3000);
        Car mazda2 = new Car("green", "mazda", 3000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(opel1);
        cars.add(opel2);
        cars.add(mazda1);
        cars.add(mazda2);


        for (Car car : cars) {
            System.out.println(car);
        }

        // сортировка по brand
        Comparator<Car> carComparator = new BrandComporator().thenComparing(new PriceComporator()).thenComparing(new ColorComporator());
        cars.sort(carComparator);
        System.out.println(cars);

    }
}

class BrandComporator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {    // сравниваем объекты по бренду
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class PriceComporator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) { // сравнивание по прайсу
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}

class ColorComporator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) { // сравнение по цвету
        return o1.getColor().compareTo(o2.getColor());
    }
}





