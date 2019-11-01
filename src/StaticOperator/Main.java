package StaticOperator;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "dvornik");
        employee1.setTimeEnd(LocalDateTime.of(2019, Month.OCTOBER, 25, 6, 00));
        employee1.setTimeStart(LocalDateTime.of(2019, Month.OCTOBER, 25, 14, 00));


        Employee employee2 = new Employee("Mike", "hunter");
        employee2.setTimeStart(LocalDateTime.of(2019, Month.OCTOBER, 25, 8, 00));
        employee2.setTimeEnd(LocalDateTime.of(2019, Month.OCTOBER, 25, 21, 00));

        employee1.printCurrentStatistic();

        employee2.printCurrentStatistic();

        System.out.println(Employee.company);

        Employee.changeCompany("RDV");

        employee1.printCompany();
        employee1.company = "employee1 company";

        employee2.printCompany();
    }
}