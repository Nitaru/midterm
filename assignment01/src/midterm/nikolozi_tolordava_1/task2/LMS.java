package midterm.nikolozi_tolordava_1.task2;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage = new ArrayList<>();

    public void addBook(Book book) {
        storage.add(book);
    }

    public boolean removeBook(Book book) {
        return storage.remove(book);
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Book b : storage) {
                System.out.println(b);
            }
        }
    }
}
