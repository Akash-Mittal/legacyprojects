package pkg15.aop.spring1;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class AdminTrackThrowsAdvice implements ThrowsAdvice
{
	public void afterThrowing(Method method, Object[] args, Object target, Throwable t)
	{
		System.out.println("Error : " + t.getMessage());
	}
}
