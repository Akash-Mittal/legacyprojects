package pkg15.spring.aop1;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowing implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
	{
		System.err.println("This is in ThrowsAdvice"+ex.getMessage());
	}
}
