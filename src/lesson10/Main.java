package lesson10;

import lesson4.Library;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("string 1");
        linkedList.add("string 2");
        linkedList.add("string 3");

        System.out.println(linkedList.get(2));



        Transport transport1 = new Transport("Москва", "Тверь","134у");
        Transport transport2 = new Transport("Санкт-Петербург", "Тамбов", "468ф");

        LinkedList<Transport> transportList= new LinkedList<>();
        transportList.add(transport1);
        transportList.add(transport2);

        Bus bus = new Bus("Самара", "Рязань", "4324", true);
        Bus bus1 = new Bus("Калуга", "Чебоксары", "41242", false);

        transportList.add(bus);
        transportList.add(bus1);

        Transport transortFromList = transportList.get(1);
    }

    public static Bus getThird(LinkedList< ? extends Transport> list){
//        Bus bus= new  Bus("Самара", "Рязань", "4324", true);
//        list.add(bus);
        return (Bus) list.get(2);

    }

    public void addToList(LinkedList< ? super Transport> list){
        Bus bus= new  Bus("Самара", "Рязань", "4324", true);
        list.add(bus);


    }
}
