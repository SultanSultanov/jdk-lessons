package lesson16;

public class Calculator {

    public double calculate(double a, double b, Operation operation) {
        return operation.execute(a, b);
    }

    public static void main(String[] args) {
        Operation plus = (a, b) -> a + b; // если аргументы не передаются мы обязаны поставить круглые скобки,
        Operation div = (a, b) -> {  // если несколько аргументовб то так же обязательно
            if (b == 0) throw new IllegalArgumentException("b не может быть 0");
            return a / b;
        };
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(2, 2, plus));
        System.out.println(calculator.calculate(2, 3, div));



    }

}
