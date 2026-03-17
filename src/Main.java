public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book One", "Author A", 100, true);
        Book book2 = new Book("Book Two", "Author B", 200, true);
        Book book3 = new Book("Book Three", "Author C", 300, false);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println("\n--- Testing ---");
        book1.borrow();
        book3.borrow(); 
        book1.returnBook();
    }
}