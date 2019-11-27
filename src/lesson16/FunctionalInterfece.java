package lesson16;

import java.util.function.Function;
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

        // Интерфейс Functional<T, R>
        // R apply(T t);

        // default:
        // andThen(Function after)
        // compose(Function after)

        Function<Integer, Double> tenPercent = (num) -> num * 0.1;
        Function<Integer, Integer> plusTen = (num) -> num + 10;
        Function<Integer, Integer> plusFive = (num) -> num + 5;

        System.out.println(plusTen.andThen(plusFive).andThen(tenPercent).apply(16));

        Function<Integer, Integer> addTwo = (num) -> num * 2;
        Function<Integer, Integer> sqrt = (num) -> num * num;

        System.out.println(addTwo.andThen(sqrt).apply(3)); // 36
        System.out.println(addTwo.compose(sqrt).apply(3));

        // функция принемает на вход число 4 и возвращает "4$"
        Function<Integer, String> fsf = (num) -> num + "$";
        System.out.println(fsf.apply(4));

        // дан Predicate condition и два Functional ifTrue b ifFalse.
        // Написать метод, который вернет новую функцию (Function), возвращающую результат работы функции isTrue,
        // если condition == true и наоборот
        Predicate<Integer> coud = (num) -> num > 0;
        Function<Integer, Integer> func = getFunction(coud, plusFive, plusTen);
        System.out.println(func.apply(5));


    }

    public static Function<Integer, Integer> getFunction(Predicate<Integer> condition,
                                                         Function<Integer, Integer> ifTrue,
                                                         Function<Integer, Integer> isFalse) {
        return num -> condition.test(num) ? ifTrue.apply(num) : isFalse.apply(num);


        // BinaryOperator<T>  принемает два аргумента одного типа и возвращает объект того же типо
        // apply(T t1, T t2)

        // UnaryOperator<T> принемает один аргумент и возвращает объект того же типа
        // apply(T t)

        // Consumer<T>
        // void accept(T T); ничего не возвращает




    }
}


