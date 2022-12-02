package starter.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Yoo Ju Jin(jujin1324@daum.net)
 * Created Date : 2022/12/02
 */

@Slf4j
@Component
@Aspect
public class LogAspect {
    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("================= Log execution test");

        return joinPoint.proceed();
    }
}
