package pkg15.afterreturn1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {

	public static void main(String[] args) {
		MessageWriter target = new MessageWriter();

		// create the proxy
		ProxyFactory pf = new ProxyFactory();

		pf.addAdvice(new SimpleAfterReturningAdvice());
		pf.setTarget(target);
		pf.addInterface(IMessageWriter.class);
		IMessageWriter proxy = (IMessageWriter) pf.getProxy();

		// write the messages
		proxy.writeMessage();
	}

	@Override
	public void afterReturning(Object returnValue, Method method,Object[] args, Object target) throws Throwable {
		System.out.println("");
		System.out.println("After method: " + method.getName());
		System.out.println("After returning from the method this line is printerd");
	}
}
