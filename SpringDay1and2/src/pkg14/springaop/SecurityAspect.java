package pkg14.springaop;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SecurityAspect 
{
	@Before("execution(public * pkg14.springaop.*.*(..))")
	public boolean checkAccess() {
		System.out.println("Checking access before method invoke");
		return true;
	}
}
