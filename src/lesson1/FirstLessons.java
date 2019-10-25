package lesson1;

import java.util.Scanner;

public class FirstLessons {
    //   однострочный коменнтарий
/* многострочный коменнтарий
     лрггн*/
    public static void main(String[] args) { // psvm
        // Объявление переменных

//    ССылочные типы данных
//  Приметивные типы данных
//   byte - 1 байт ( от -128 до 127) используется для работы с потоками данных и может использоваться в массивах для экономии данных
        // Объясление переменной типы byte
        byte byteVar = 12;
        // short - 2 байта
        // от -32768 до 32767
        // Объявление переменной типа short
        short shortVar = 12;
        short shortVar1 = 19;
        //short shortRes = shortVar + shortVar1;
        // ошибка. тк в арифметических операциях вычисления выполняются как с типом int
        //int - 4 байта
        int intVar = 7;
        int intVar2 = 2;
        int intRes = intVar / intVar2; // при делении дробная часть отбрасывается
        // для удобства доступна записть
        int intVar1 = 1_000_000;
        //  int zeroDivision = intVar / 0;

        // long - 8 байт
        long longVar = 3000000000L;

        // числа с плавающей точкой
        // float - 4 байта
        float floatVar = 3.5F;
        float zeroDivisionFloat = floatVar / 0; // при делении на 0 получаем бесконечность (Infinity)

        //double - 8 байт
        double doubleVar = 5.7;
        Double zeroDivisionDouble = doubleVar / 0; // при делении на 0 получаем бесконечность (Infinity)

        //char - 2 байта
        // хранит символы в таблице Unicode в кодировке UTF - 16
        // от 0 до 65536

        // boolean
        // true / false

        boolean close = true;
        boolean isActive = false;


        // приведение типов
        // 1. автоматическое преобразование
        byte byteVar3 = 3;
        int intVar3 = byteVar3;
        // явное преобразование
        int Var3 = 45;
        byteVar3 = (byte) intVar3;

        // операторы
        // операторы присваивания
        // = , +=, -=, *=. /=. %=
        int a = 7;
        a = a + 4; // a+=4

        // фрифметические операторы
        // +, - , *, /, %

        // инкремент (увеличивает на 1)
        // i++ ++i

        // деркемент (уменьшает на 1)
        // i-- --i

        // операторы сравнения (результат работы либо true, либо false)
        // >, <, >=, <=, !=<, ==

        System.out.println("Выводимая информации"); // sout

        System.out.printf("форматированнный вывод %s\n", "данный");
        // %f для вывода чисел с плавающей точкой
        // %d для вывода целых чисел
        // %s для вывода строк

        //консольный ввод
        Scanner in = new Scanner(System.in); // alt + Enter -> Import Class
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.printf("Вы ввели: %d\n", num);


        // логические операторы - применяются к boolean переменным и boolean выражениям
        // && И
        // || ИЛИ
        // ! НЕ
        // ^ Исключающее или

        // тернарный оператор
        // Переменная y = (условие) ? выражение : выражение2)

        int x = 3;
        int y = 2;
        int res = x > y ? x - y : x + y;

        // конструктор ветвления
//    if (условие) {
//        //код выполнет, если условие true
//    }
//    else  {
//        //код выполнет, если условие true
//    }
//
//    if (условие) {
//        //код выполнет, если условие true
//    }
//    else if(условие2)  {
//        //код выполнет, если условие - false b условие2 true
//    }
        System.out.println("Введите число");

        switch (in.nextInt()) {
            case 1:
                System.out.println("Вариант 1");
                break;
            case 2:
                System.out.println("Вариант 2"); // выполняется до первого брейка
                break;
            case 3:
            case 4:
                System.out.println("Вариант 3, 4");
                break;
            default:
                System.out.println("Вариант yt jghtltkty");
                break;
        }

        // Побитовые операторы
        int k = 2; // 10
        int j = 4; // 100
        System.out.printf("Результат k & j = %d\n", k & j); // 000 -> 0;

        k = 4; // 100
        j = 5; // 101
        System.out.printf("Результат k & j = %d\n", k & j); // 100 -> 4

        // Логическое сложение

        k = 2; // 010
        j = 4; // 100
        System.out.printf("Результат k | j = %d\n", k | j); // 110 -> 6

        k = 4; // 100
        j = 5; // 101
        System.out.printf("Результат k | j = %d\n", k | j); // 101 -> 5

        // Операции сдвига

        // a<<b сдвигает число а влево на b Разрядов
        // a<<1 эвивалентно умножению на 2

        System.out.printf("Сдвиг влево 5 << 1 = %d\n", 5 << 1);
        //101 на 1 разряд -> 1010 -> 10


        // a>>b сдвигает число а вправо на b Разрядов
        // a>>1 эвивалентно делению на 2

        System.out.printf("Сдвиг вправо 4 >> 1 = %d\n", 4 >> 1);
        //100 на 1 разряд -> 10 -> 2

        // Чётность чилса n & 1 если число четное, результат 0,
        //
    }

}
