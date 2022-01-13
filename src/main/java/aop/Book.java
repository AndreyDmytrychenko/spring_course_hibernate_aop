package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Book {
    @Value("${book.title}")
    private String title;
    @Value("${book.size}")
    private int size;
    @Value("${book.year}")
    private int yearOfPublication;



    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
