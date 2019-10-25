package lesson4;

public class Book {
    // свойства, плдя, атрибуты
    //  название книг
    // privat - это доступ к объекту только внутри метода в котором создан
    private String title; // по умолчанию для ссылочных типо null
    private String author;
    private boolean IsForHome; // по умолчания по умолчанию это false
    private boolean isValible = true;


    // методы, устанавлювающие значение свойста title и author


    public void setTitle(String title) { // void - это означает что метод никаких значение не возвращает
        // this  - это ссылка на текущий объект
        if (title != null && !"".equals(title)) {
            this.title = title;
        }

    }

    // alt + insert
    public void setAuthor(String author) { // методы которые устанавливаю значения свойств - называются Сеттеры
        this.author = author;
        //в void может использоваться return, только для прекращания работы метода, но он ничег оне вернет
    }

    // методы которые возвращают значения свойств - Геттеры ( alt + inser )


    public String getTitle() { // метод возвращает значение ( можем присовить значение переменной)
        return title;   // retur прекращает работу метода
    }

    public String getAuthor() {
        return author;
    }

    public void setForHome(boolean forHome) {
        IsForHome = forHome;
    }

    public void setValible(boolean valible) {
        isValible = valible;
    }

    public boolean isForHome() {
        return IsForHome;
    }

    public boolean isValible() {
        return isValible;
    }

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    public Book() {
    }

    public Book(String title) {
        setTitle(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", IsForHome=" + IsForHome +
                ", isValible=" + isValible +
                '}';
    }
}
