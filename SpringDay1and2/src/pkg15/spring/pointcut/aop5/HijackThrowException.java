package pkg15.spring.pointcut.aop5;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}

}
