package lesson10;


//generic в наследовании
public class Garage<T extends Bus>  {
    private T bus;

    public Garage(T bus) {
        this.bus = bus;

    }

    public T makeDefault() {
        bus.setDepartureSt("Москва");
        bus.setDeestSt("Санкт-Петербург");
        bus.setNum("234f");
        bus.setWiFi(false);
        return  bus;
    }
}
