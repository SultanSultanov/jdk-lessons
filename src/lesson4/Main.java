package lesson4;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book java = new Book(); // тип данных, имя переменной, конструктор
        Book cleanCode = new Book();

        //для достипа к атрибутам обекта поставить точку, потом написать тот атрибут к торому хотим обратиться ( имя объекта.свойство)
//        java.title = "Философия Java";
//        cleanCode.title = "Чистый код";
//
//        java.author = "Брюс Эккель";
//        cleanCode.author = "Роберт Мартин";

        // вызов метода
        java.setTitle("Философия Java");
        cleanCode.setTitle("Чистый код");

        System.out.println(java.getTitle()); // у объекта java вызывает метод getTitle
        System.out.println(cleanCode.getTitle());

        java.setAuthor("Брюс Эккель");
        cleanCode.setAuthor("Роберт Мартин");

        java.setForHome(true);

        Book forBegginers = new Book("Руководство для начинающих", "Герберт Шилдт");

        System.out.println(java);
        System.out.println(cleanCode);
        System.out.println(forBegginers);

        Library library = new Library();
        library.addBook(java);
        library.addBook(cleanCode, forBegginers);

    }
}
