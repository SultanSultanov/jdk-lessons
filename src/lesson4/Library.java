package lesson4;

public class Library {
    private Book[] books = new Book[10];

    // в библиотеку можно добавить одну книгу
    public void addBook(Book newBook) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
                return;
            }
        }
    }
    // в библиотеку можно добавить сразу несколько книг

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book... newBooks) { //перегруз методов
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                System.arraycopy(newBooks, 0, this.books, i, newBooks.length);
                break;
            }
        }
    }
}

