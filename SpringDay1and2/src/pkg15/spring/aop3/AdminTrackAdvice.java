package pkg15.spring.aop3;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AdminTrackAdvice implements MethodBeforeAdvice,AfterReturningAdvice
{
	private AdminTrack adminTrack;
	
	public void setAdminTrack(AdminTrack adminTrack) {
		this.adminTrack = adminTrack;
	}

	@Override
	public void before(Method method, Object[] args, Object target)	throws Throwable 
	{
		System.out.println("-----Begin Action : " + method.getName() + "-----");
		adminTrack.logToFile();
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable 
	{
		System.out.println("Complete Action : " + method.getName());
		adminTrack.sendMail();
	}
}
