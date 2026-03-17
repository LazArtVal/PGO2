public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println("Book: " + title + " | Author: " + author + " | Pages: " + pageCount + " | Available: " + available);
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Success: You borrowed '" + title + "'");
        } else {
            System.out.println("Error: '" + title + "' is unavailable");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Success: You returned '" + title + "'");
        } else {
            System.out.println("Error: '" + title + "' is already in the library");
        }
    }
}