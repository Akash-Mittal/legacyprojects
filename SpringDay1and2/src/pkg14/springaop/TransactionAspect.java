package pkg14.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class TransactionAspect {
 
	@Pointcut("execution(public * pkg14.springaop.*.message1(..))")
 public void greetingmethod() {
		System.out.println("point cut");
	} 
 @Before("greetingmethod()")
 public void beforeMethod()
 {
	 System.out.println("before method");
 }
 
 
 @After("greetingmethod()")
 public void afterMethod()
 {System.out.println("After method");
	 
 }
 
 @Around("greetingmethod()") 
 public Object doTran(ProceedingJoinPoint pjp) throws Throwable {
  System.out.println("Starting a transaction Before calling the method") ;
  Object output = pjp.proceed();
  System.out.println("Completing the transaction After calling the method") ;
  return output ;
 }
}
