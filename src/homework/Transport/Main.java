package homework.Transport;

public class Main {
    public static void main(String[] args) {

        Bike aist = new Bike("Aist", "Red",500,20,20);
        Bike shkolnik = new Bike("Shkolnik", "Yellow",700,22,15);
        Car mersedes = new Car("Mersedes", "Black", 2000,200,2000);
        Car volvo = new Car("Volvo", "Green", 1500,150,2300);
        Motorcycle suzuki = new Motorcycle("Suzuki", "Red",1000,200,100);
        Motorcycle yamaha = new Motorcycle("Yamaha", "Orange",1100,210,110);

        Garage garage = new Garage();
        garage.addTransport(aist);
        garage.addTransport(shkolnik);
        garage.addTransport(mersedes);
        garage.addTransport(volvo);
        garage.addTransport(suzuki);
        garage.addTransport(yamaha);

        System.out.println(aist.travelTime(1000));
        System.out.println(volvo.travelTime(1000));
        System.out.println(suzuki.travelTime(1000));




    }
}
