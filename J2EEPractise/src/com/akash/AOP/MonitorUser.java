/*
 Example
	(When userAddrss is not verified 
	1.) Make user connection offline
	2.) Send Confirmation SMS to user 
	3.) Notify Admin)
*/	
 

package com.akash.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class MonitorUser {
	
	@Pointcut("execution(* com.akash.AOP.UserService.addUser(..))")
	public void notifyAdmin(){}
	
	//@Pointcut()
	public void notifyUser(){}
	

	//@Before(value="com.akash.AOP.UserService.addUser(..)")
	//@Around("execution(public com.akash.AOP.UserService.*(..))")
	//@Around("com.akash.AOP.UserService.addUser(..)")
	//@AfterReturning("notifyAdmin()")
	public void doProfiling(JoinPoint joinPoint) throws Throwable{
		System.out.println(joinPoint.getTarget());
	}	
	
	@Around("notifyAdmin()")
	public Object doProfiling(ProceedingJoinPoint joinPoint) throws Throwable{
		User user=null;
		Object object[]=joinPoint.getArgs();
		for(Object object2 : object)
		{	if(!(object2 instanceof User))
			break;
			user = (User) object2;
			if (!user.getIsVerified()) {
				System.out.println(":User"+user.getUserName()+" not verified Offlining");
				user.setOffLine(true);
				System.out.println(":Sending SMS to user");
				System.out.println(":Sending mail to admin");
			}
			System.out.println("--"+object2);
		}	
		//return joinPoint.proceed();
		return user;
	}
}
