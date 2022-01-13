package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class University {

    private List<Student> students = new ArrayList<>();
    public void addStudents() {
        Student st1 = new Student("Ivan Petrov", 3, 7.6);
        Student st2 = new Student("Tom Fast", 2, 9.6);
        Student st3 = new Student("Pit Manson", 5, 8.6);
        students.addAll(Arrays.asList(st1, st2, st3));
    }
    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents()");
        System.out.println(students.get(5));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        System.out.println("_____________________________________________");

        return students;
    }
}
