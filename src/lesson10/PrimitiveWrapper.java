package lesson10;

import ferma_v2.homeAnimal.HomeAnimal;

public class PrimitiveWrapper {
    public static void main(String[] args) {
        // Классы обертки хранят значение соотвествующего примитива
        // int -> Integer
        // short -> Shory
        // byte -> Byte
        // Long -> Long
        // char -> Character
        // boolean -> Boolean
        // float -> Float
        //double -> Double

        int a = 56;
        Integer integer = a;
        int b = integer;

        Double d = 3.78;
        Boolean boo = Boolean.FALSE;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // методы, преобразования строки в число
        // "78"
        System.out.println(Byte.parseByte("2")); // парс возвращают примитив
        System.out.println(Byte.valueOf("2")); // получаем объект

        System.out.println(Integer.parseInt("21")); // парс возвращают примитив
        System.out.println(Integer.valueOf("21")); // получаем объект

        // System.out.println(Integer.valueOf("51fwegrehedrhe"));  ошибка Эксепшн

        //Сравнение
        // от -128 до 127

        Integer integer1 = 3;
        Integer integer2 = 3;
        if (integer1 == integer2) System.out.println("==");

        Integer integer3 = 500;
        Integer integer5 = 500;
        if (integer3 == integer5) System.out.println("==");

        integer3.equals(integer5);

        integer1.doubleValue(); // получает примитив дамл
        integer1.longValue(); // получаем примитив лонг

        System.out.println(Integer.compare(integer1, integer2));
        System.out.println(Integer.min(integer1, integer2));
        System.out.println(Integer.max(integer1, integer2));


        System.out.println(Integer.sum(integer1, integer2));
        System.out.println(Integer.hashCode(integer1));


    }
}
