package aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    //the name of the methods we want to intercept
    @Before("execution(* services.HelloService.hello(..))")
    public void before() {
        System.out.println("A Aspect before");
    }

    //executes after the method (even if exception happening)
    @After("execution(* services.HelloService.hello(..))")
    public void after() {
        System.out.println("B Aspect after");
    }

    //executes only if the method executes without exception
    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterReturning() {
        System.out.println("C Aspect after returning");
    }

    //executes only if exception
    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing() {
        System.out.println("D Aspect after throwing");
    }

}
