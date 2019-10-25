package lesson3;

import java.util.Arrays;
import java.util.StringJoiner;

public class Strings {
    public static void main(java.lang.String[] args) {
        //Строки
        //до 9 версии как у массива char[]
        //каждый символ занимает 2 байта
        //Кодировка UTF-16

        // Начиная с 9 версии - компактная строки
        // строки хранятся как массив byte[]
        // LATIN - 1
        // UTF - 16
        // byte coder;
        // byte LATIN! = 0;
        // byte UTF16 = 1;

        // Строки в Java неизменн и потокобезопасны

        char[] charsArr = {'j', 'a', 'v', 'a'};
        java.lang.String str = new java.lang.String(charsArr);
        java.lang.String str1 = "Java";
        java.lang.String str2 = new java.lang.String("Java");
        java.lang.String str3 = "Java";
        java.lang.String str4 = str2.intern(); // объект строки создаеся в пуле строк )если такой строки нет).
        // Если такая строка содержится в пуле строк, то просто возвращаем ссылку на нее

        str3.codePoints().forEach(System.out::println);

        //количество символов в строке
        System.out.println("количество символов в строке" + str3.length());

        // сравнение строк
        str = "JAVA";
        str1 = "Java";

        System.out.println(str.equals(str1)); // false
        // сравнение юез учета регистра
        System.out.println(str.equalsIgnoreCase(str1)); // true

        int comparePes = str.compareTo(str1);
        System.out.println("comparePes " + comparePes);

        comparePes = str.compareToIgnoreCase(str1);
        System.out.println("comparePes " + comparePes);

        // 0 - если строки равны
        // положительное число - если первая строка следует за второй
        // отрицательное целое число - если первая строка предшествует второй

        // поиск в строке
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.endsWith("b")); // False

        // indexOf("символ")  - для поиска первого вхождения указанного символа, лиюо подстроки (вернет индекс)
        // lastIndexOf ("сивол") - для поска последнего нахождения символа. либо подстроки ( вернет индекс)
        // -1 - если символ или подстрока не найдена

        System.out.println(str.indexOf("V"));
        System.out.println(str.indexOf("v", 2));


        str = "Java Junior Development";
        str1 = "Java";

        System.out.println(str1.contains(str1)); // true
        System.out.println(str1.contains(str)); // false

        // Модификация строк (в результате преобразований будет создана новая строка)

        // toLowerCase() - преобразование в нижний регистр
        java.lang.String lowerStr = str.toLowerCase();


        // toUpperCase() - преобразование в верхний регист
        // trim()  - убирает пробелы
        // reverse() - переворачивает строку

        java.lang.String newStr = str.replace("Junior", ""); // замена слов
        System.out.println(newStr);
        java.lang.String newStrе = str.replaceAll("v", "V"); // замена всех слов


        str = "Java Junior Development";
        // забивает строку, возвращая массив
        java.lang.String[] strings = str.split("\\s");
        System.out.println(Arrays.toString((strings)));

        //substring(int begin, int end)
        //substring (int begin)
        // - взятие подстроки

        System.out.println(str.substring(3, 6));

        // конкатинация строк = соединение
        java.lang.String concatString = "Java" + "Junior";  // не используем в цикле
        System.out.println(concatString);

        concatString = concatString.concat("Delevopment").concat("!"); // не используем в цикле
        System.out.println(concatString);

        str = "String";
        for (int i = 0; i < 7; i++) {
            str += "iteration " + i; // на каждой итерации создается объект
        }
        System.out.println(str);

        // Классы для работы со строками (с возможностью изменения строки)
        // StringBuilder - работает быстрее, чем StringBuffer, но он не потокобезопасен
        // StringBuffer - работает медленее чем StringBuilder, но потокобезопасен

        str = "String";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);

        for (int i = 0; i < 7; i++) {
            stringBuilder.append("iteration ").append(i);
        }
        str = stringBuilder.toString();

        // объединение строк
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("One");
        joiner.add("Two");
        java.lang.String joinString = joiner.toString();
        System.out.println(joinString);

        System.out.println(java.lang.String.join(", ", "One", "Two")); // короткая запись

        System.out.println('a' + 'a');
        System.out.println('b' - 'a');
        System.out.println('b' * 'b');
        System.out.println(+'c');

    }
}
