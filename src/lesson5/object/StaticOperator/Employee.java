package lesson5.object.StaticOperator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {  // статические свойста и методы пренадлежат классам

    static String company; // могут быть статические свойства

    static {
        company = "HEV"; // статический блок загружается в память 1. раз при загрузке классов
    }

    static void changeCompany(String newCompany){
        company = newCompany;
    }

    void printCompany(){
     //   company = "new";
        System.out.println(company);
    }



    private String name;
    private String position;

    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getTimeStart() {
        return timeStart.format(DateTimeFormatter.ofPattern("d MMMM yyyy в HH:mm"));
    }

    public String getTimeEnd() {
        return timeEnd.format(DateTimeFormatter.ofPattern("d MMMM yyyy в HH:mm"));
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }



    public void printCurrentStatistic() {
        System.out.println(this.position + " " + this.name + " пришел: " + getTimeStart() + " ушел: " + getTimeEnd());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", timeStart=" + getTimeStart() +
                ", timeEnd=" + getTimeEnd() +
                '}';
    }
}
