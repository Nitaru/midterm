package midterm.nikolozi_tolordava_1.task2;

public class LibraryTester {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Lord of the Rings");
        b1.setAuthor("Tolkien");

        Book b2 = new Book();
        b2.setTitle("Introduction to OOP");
        b2.setAuthor("Paata Gogishvili");

        LMS lms = new LMS();
        lms.addBook(b1);
        lms.addBook(b1); // Adding the same book again to demonstrate removal
        lms.addBook(b2);
        lms.removeBook(b1); // Removing one copy of "Lord of the Rings"
        lms.printStorage();
    }
}
