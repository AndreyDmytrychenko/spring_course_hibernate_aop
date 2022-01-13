package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(String aop.UniLibrary.getBook())")
    public void getMethods() {
    }
    @Pointcut("execution(* aop.University.getStudents())")
    public void pointCat_for_university() {}
}
