package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary lib = context.getBean("uniLibrary", UniLibrary.class);
        String book = lib.getBook();
        System.out.println(book);
    }

}
