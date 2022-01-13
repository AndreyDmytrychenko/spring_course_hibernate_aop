package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspectForUniLib {

    @Around(value = "aop.aspects.MyPointCuts.getMethods()")
    public Object aroundLoggingForUniLibAdvice(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("aroundLoggingForUniLibAdvice: start");

        Object resultTargetMethod = jp.proceed();

        System.out.println("aroundLoggingForUniLibAdvice: end");

        return resultTargetMethod;
    }
}
