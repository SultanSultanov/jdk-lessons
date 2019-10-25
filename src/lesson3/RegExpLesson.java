package lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpLesson {
    public static void main(String[] args) {
        // для работы с регулярными выражениями
        // Pattern b Matcher
        String regExp = "Java Junior";
        String soneStr = "Java Junior";

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(soneStr);

        // вернет true в случае, если вся строка (someExp)
        // соответсвует регулярному выражению (regExp)
        soneStr = "Java Junior Developer";
        pattern = Pattern.compile("developmer$", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(soneStr);

        System.out.println(matcher.find());

        // вернет true в случае, если в строке есть подстрока, короткая удовлетворяет регулярному выражению

        soneStr = "Java Junior Developer";
        pattern = Pattern.compile("[A-Z0-9]");
        pattern = Pattern.compile("[ert]");
        while (matcher.find()) System.out.println(matcher.group());

        // a.+o
        soneStr = "Java Junior Developer";
        pattern = Pattern.compile("a.+o"); // жадный поиск
        matcher = pattern.matcher(soneStr);
        while (matcher.find()) System.out.println(matcher.group());

        soneStr = "Java Junior Developer";
        pattern = Pattern.compile("a.+?o"); // ленивый поиск
        matcher = pattern.matcher(soneStr);
        while (matcher.find()) System.out.println(matcher.group());

        soneStr = "Java Junior Developer";
        pattern = Pattern.compile("a.++o"); // сверхжадный поиск
        matcher = pattern.matcher(soneStr);
        while (matcher.find()) System.out.println(matcher.group());

        // группировка + опережающие и распростроненные проверки

        soneStr = "N(NNoifwnfw9few9g9we199432";
        regExp = "(?=.*[0-9])(?=.*[,/?])(?=.*[A-Z])[0-9A-Za-z./?]{3,}";
        pattern = Pattern.compile("a.++o");
        matcher = pattern.matcher(soneStr);
        System.out.println(matcher.find());
        // ?= - опережающая проверка
        // ?! -
        // для email
        // найти все предложения в тексте ( начинаются с заглавное буквы, оканчивается на ? . !)
        regExp = "[A-Z].+[.!]";
        // Найти все слова, начинается на f
        regExp = "^f(.*\\b){5,8}";
        // номер телефона в формате +7ххх-ххх-хх-хх
        regExp = "\\+7[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}";

        // даны 2 слова, состоящие из четного количества букв
        // Нужно составить третье слово из мерввой поливины 1го и второй половины второго

        // найти самое длинное слово в предложении (при условии, что слова разной длинны)

        String a = "молоко";
        String b = "корова";
        System.out.println(a.substring(0, 3) + b.substring(3));


    }
}
