import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Library {
    private HashMap<Integer, Book> bookMap;

    public Library() {
        bookMap = new HashMap<>();
    }

    public void addBook(int key, Book book) {
        bookMap.put(key, book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (HashMap.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() +
                    ", Author: " + entry.getValue().getAuthor() + ", Quantity: " + entry.getValue().getQuantity());
        }
    }

    public boolean containsBook(String bookName) {
        for (Book book : bookMap.values()) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(int key) {
        bookMap.remove(key);
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding some books
        Book book1 = new Book(1, "Harry Potter", "J.K. Rowling", 10);
        Book book2 = new Book(2, "Lord of the Rings", "J.R.R. Tolkien", 15);

        library.addBook(101, book1);
        library.addBook(102, book2);

        // Displaying the collection of books
        library.displayBooks();

        // (a) Check if a particular book name is present in the map
        String searchBookName = "Harry Potter";
        System.out.println("\nIs \"" + searchBookName + "\" present in the library? " + library.containsBook(searchBookName));

        // (b) Remove the value associated with a particular key value
        int keyToRemove = 101;
        System.out.println("\nRemoving the book with ID " + keyToRemove + " from the library...");
        library.removeBook(keyToRemove);
        System.out.println("Book removed successfully.");

        // Displaying the updated collection of books
        System.out.println("\nUpdated collection of books:");
        library.displayBooks();
    }
}
