package lesson16;

import java.util.function.Predicate;

public class FunctionalInterfece {
    public static void main(String[] args) {
        // встроенные функциональные интерфейсы
        // интрерфейс Predicate<T>
        // boolean test(T t);  возвращает true ли false

        // default:
        // or(Predicate p)
        // and (Predicate p)
        // negative (Predicate p)

        Predicate<Integer> pos = (num) -> num > 0;
        Predicate<Integer> neg = (num) -> num < 0;
        Predicate<Integer> isEven = (num) -> num % 2 == 0;

        System.out.println(pos.test(23)); // true
        System.out.println(neg.test(234)); // false
        System.out.println(pos.and(isEven).test(45)); // false
        System.out.println(neg.or(isEven).test(22));  // true



    }
}


