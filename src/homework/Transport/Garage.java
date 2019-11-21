package homework.Transport;
public class Garage {
    protected Transport[] transports = new Transport[6];



    public boolean addTransport(Transport transport) {    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.transports.length; i++) {
            if (this.transports[i] == null) {
                this.transports[i] = transport;
                return true;
            }
        }
        return false;



    }
}
