package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlerAspect {
   // @Before("aop.aspects.MyPointCuts.getMethods()")
    public void beforeAddExceptionHandlerAdvice() {
        System.out.println("beforeAddExceptionHandlerAdvice: ловим исключение");
        System.out.println("_____________________________________________");
    }
}
