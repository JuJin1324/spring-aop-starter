package starter.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Yoo Ju Jin(jujin1324@daum.net)
 * Created Date : 2022/12/02
 */

@Component
@Aspect
@Slf4j
public class ParameterNullCheckAspect {
    @Around("execution(* starter.spring.aop.*.service..*(..))")
    public Object logServiceException(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        try {
            Arrays.stream(args)
                    .forEach(arg -> {
                        if (arg instanceof Collection) {
                            // continue
                        } else if (ObjectUtils.isEmpty(arg)) {
                            throw new IllegalArgumentException();
                        }
                    });
            return joinPoint.proceed();
        } catch (Throwable ex) {
            log.error("Has called method {} with args: {}",
                    joinPoint.getSignature().toString(), args, ex);
            throw ex;
        }
    }
}
