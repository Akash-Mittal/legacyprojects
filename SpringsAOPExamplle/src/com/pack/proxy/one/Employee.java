package com.pack.proxy.one;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class Employee implements IEmployee {
	
	private Integer eId;
	private String eName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	public static void main(String[] args) {
		ProxyFactory proxy = new ProxyFactory(new Employee(12,"Akash"));
		proxy.addAdvice(new MyAdvice());
		proxy.addAdvice(new AfterMyAdvice());
		proxy.setTarget(IEmployee.class);
		IEmployee emp = (IEmployee) proxy.getProxy();
		System.out.println(emp);
	}


	/* (non-Javadoc)
	 * @see com.pack.proxy.one.IEmployee#geteId()
	 */
	@Override
	public Integer geteId() {		return eId;}
	/* (non-Javadoc)
	 * @see com.pack.proxy.one.IEmployee#seteId(java.lang.Integer)
	 */
	@Override
	public void seteId(Integer eId) {this.eId = eId;}
	/* (non-Javadoc)
	 * @see com.pack.proxy.one.IEmployee#geteName()
	 */
	@Override
	public String geteName() {return eName;}
	/* (non-Javadoc)
	 * @see com.pack.proxy.one.IEmployee#seteName(java.lang.String)
	 */
	@Override
	public void seteName(String eName) {this.eName = eName;}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}

}

class MyAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Before Advice \t"+arg0.getName());
		for(Object i : arg1)System.out.println("args1 "+i.toString());
		System.out.println("args2 "+arg2);
		
	}
}
class AfterMyAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("After Advice \t"+arg0.toString());
		System.out.println("args1 "+arg1);
		for(Object i : arg2)System.out.println("args2 "+i.toString());
		
		
	}
	
}	
	
 

