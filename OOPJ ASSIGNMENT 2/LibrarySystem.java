class Book {
    int bookId;
    String bookName;

    Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
}

class Library {
    void displayBooks(Book[] books) {
        System.out.println("\n--- Library Books ---");
        for (Book b : books) {
            System.out.println("Book ID: " + b.bookId + ", Book Name: " + b.bookName);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming");
        Book b2 = new Book(102, "Database Systems");
        Book b3 = new Book(103, "Operating Systems");

        Book[] books = {b1, b2, b3};

        Library lib = new Library();
        lib.displayBooks(books);
    }
}