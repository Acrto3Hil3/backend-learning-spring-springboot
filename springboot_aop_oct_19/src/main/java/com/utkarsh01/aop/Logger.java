package com.utkarsh01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
/*
@Aspect 
@Slf4j @Component
public class Logger {
	
	@Before(value = "execution(* com.utkarsh01.service.*.*(..))")
	public void beforeException(JoinPoint jPoint) {
		log.info("@before exception the method.. {},{}", jPoint.toShortString(),jPoint.getArgs().length);
	}
	
	@After(value = "execution(* com.utkarsh01.service.*.*(..))")
	public void afterExecution(JoinPoint jp) {
		log.info("During @After execution ...{}", jp.toShortString());
	}

}
*/
@Aspect
@Slf4j
@Component
public class Logger {

    // Correct the pointcut expression by adding a space after the asterisk (*)
    @Before(value = "execution(* com.utkarsh01.service.*.*(..))")
    public void beforeException(JoinPoint jPoint) {
        log.info("@Before the method execution: {}, Number of arguments: {}", jPoint.toShortString(), jPoint.getArgs().length);
    }

    @After(value = "execution(* com.utkarsh01.service.*.*(..))")
    public void afterExecution(JoinPoint jp) {
        log.info("After method execution: {}", jp.toShortString());
    }
    
    @Around(value = "execution(* com.utkarsh01.*.*.*(..))")
    public void arounAdvice(ProceedingJoinPoint jp) throws Throwable {
    	log.info("During @Around Advice bbegin...{}");
    	jp.proceed();
    	log.info("During @Around Advice end....{}");
    }
}

