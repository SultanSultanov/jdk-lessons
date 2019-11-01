package object;

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        // является родительским классом для всех классов
        // toString() возвращает строчку, описывающую объект
        // hashCode() - возвращает хешкод объекта
        // equals() - проверяет на соответствие
        // clone() - для созданий копий объектов

        // getClass() wait() ...

        Owner owner1 = new Owner("Tom", "+79999999999");
        Owner owner2 = new Owner("Mike","+78888888888");
        Owner owner3 = new Owner("Tom", "+79999999999");

        Object obj = new Object();
        Car opel = new Car("Opel", "yellow",owner1);
        System.out.println(opel);


        //hashCode() + equalse()
        Car mazda = new Car("Mazda" , "red",owner2);
        Car opel2 = new Car("Opel", "yellow",owner3);

        System.out.println(opel2.hashCode());
        System.out.println(opel.hashCode());
        System.out.println(mazda.hashCode());
        System.out.println(opel.equals(opel2));


        // clone()
        Car newCar = (Car) opel.clone();

    }
}
