package aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary {

    public String getBook() {
        System.out.println("getBooks: Мы берем книгу из UniLibrary");
        return "Война и мир";

    }

    public void addBook(String name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("_____________________________________________");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("_____________________________________________");
    }
}
