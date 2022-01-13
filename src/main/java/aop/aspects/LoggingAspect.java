package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

  //  @Before("aop.aspects.MyPointCuts.getMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("Arrays.toString(joinPoint.getArgs() = " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("_____________________________________________");
    }





}
