package pkg15.spring.aop1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
public class SimpleBeforeAdvice implements MethodBeforeAdvice
{
@Override
public void before(Method method, Object[] args, Object target)
		throws Throwable {
	System.out.println("Before method: " + method.getName());
	//method.invoke(target, "aaaa","hhhhh");
}
}
