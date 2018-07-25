package pkg15.spring.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println(returnValue.toString());
		for (Object object : args) {
			System.out.println(object);
		}
		System.out.println("After method: " + method.getName());
		System.out
				.println("After returning from the method this line is printed");
	}
}
