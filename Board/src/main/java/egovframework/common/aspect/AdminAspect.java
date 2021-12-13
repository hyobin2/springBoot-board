package egovframework.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class AdminAspect {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	// 관리자용 aspect 
	@Pointcut("execution(public * egovframework.project.admin.controller..*(..))")
	private void publicTarget() {
		//적용할 지점 또는 범위	
	}
	
	//Advice : 실제 기능 구현부분
	@Around("publicTarget()")
	public Object calcPerformanceAdvice(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("실행!!");
		StopWatch sw = new StopWatch();
		sw.start();
		
		//비즈니스 로직
		Object result = pjp.proceed();
		
		sw.stop();
		logger.info("성능끝!");
		logger.debug("걸린시간{} ms",sw.getLastTaskTimeMillis());
		return result;
	}
	
}
