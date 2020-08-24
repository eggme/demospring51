package me.whiteship.demospring51;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

//    //execution
//    // PerfLoggin이라는 어노테이션이 붙은 경우에만 프록시를 해라
//    @Around("execution(* me.whiteship..*.EventService.*(..))") // Around는 메서드를 감싸는 형식으로, 다용도 어노테이션
//    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
//        long begin = System.currentTimeMillis();
//        Object retVal = pjp.proceed();
//        System.out.println(System.currentTimeMillis() - begin);
//        return retVal;
//    }

    // Annotation
    // PerfLoggin이라는 어노테이션이 붙은 경우에만 프록시를 해라
    @Around("@annotation(PerfLogging)") // Around는 메서드를 감싸는 형식으로, 다용도 어노테이션
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

//    // Bean
//    @Around("bean(simpleEventService)") // Around는 메서드를 감싸는 형식으로, 다용도 어노테이션
//    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
//        long begin = System.currentTimeMillis();
//        Object retVal = pjp.proceed();
//        System.out.println(System.currentTimeMillis() - begin);
//        return retVal;
//    }
}
