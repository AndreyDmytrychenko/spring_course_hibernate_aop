package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class LoggingUniversityAspect {



    @Before("aop.aspects.MyPointCuts.pointCat_for_university()")
    public void loggingBeforeCallMethodGetStudents() {
        System.out.println("loggingBeforeCallMethodGetStudents: логируем действия " +
                "перед вызовом метода getStudents");
        System.out.println("_____________________________________________");
    }

    @AfterReturning(pointcut = "aop.aspects.MyPointCuts.pointCat_for_university()", returning = "students")
    public void loggingAfterCallMethodGetStudents(List<Student> students) {

        Student student = students.get(0);
        String name = student.getNameSurname();
        double avg = student.getAvgGrade();
        int course = student.getCourse();
        student.setNameSurname("Mr." + name);
        student.setAvgGrade(avg + 1.2);
        student.setCourse(course + 1);

        System.out.println("loggingAfterCallMethodGetStudents: логируем действия " +
                "после вызова метода getStudents");
        System.out.println("_____________________________________________");
    }
    @AfterThrowing(pointcut = "aop.aspects.MyPointCuts.pointCat_for_university()", throwing = "throwable")
    public void afterThrowingAdviceForUniversity(Throwable throwable) {
        System.out.println("afterThrowingAdviceForUniversity() было выброшено исключение " +
                throwable.getClass().getSimpleName());
        System.out.println("_____________________________________________");

    }
    @After(value = "aop.aspects.MyPointCuts.pointCat_for_university()")
    public void afterAdviceForUniversity() {
        System.out.println("afterAdviceForUniversity()");
        System.out.println("_____________________________________________");
    }
}
