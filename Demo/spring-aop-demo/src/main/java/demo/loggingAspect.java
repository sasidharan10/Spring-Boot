package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {

    @Before("execution(* demo.shoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp)
    {
        System.out.println(jp.getSignature());
        System.out.println("Argument: " + jp.getArgs()[0].toString());
        System.out.println("Befere Logger");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger()
    {
        System.out.println("After Logger");
    }

    @Pointcut("execution(* demo.shoppingCart.quantity(..))")
    public void afterReturningPointCut()
    {

    }


    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal)
    {
        System.out.println("After returning" + retVal);
    }



}
