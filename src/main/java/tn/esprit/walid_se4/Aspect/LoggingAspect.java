package tn.esprit.walid_se4.Aspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.walid_se4.services.*.*(..))")
    public void MethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method {} : ", name);
    }
    @After("execution(* tn.esprit.walid_se4.services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method {} : ", name);
    }

}
