package pkg15.spring.aop1;

import org.springframework.aop.framework.ProxyFactory;

public class TestApp1 {

	public static void main(String[] args) {
		MessageWriter target = new MessageWriter();
		// create the proxy
		ProxyFactory pf = new ProxyFactory();
		//pf.addAdvice(new SimpleAfterReturningAdvice());
		// pf.addAdvice(new SimpleBeforeAdvice());
		// pf.addAdvice(new SimpleThrowing());
		pf.setTarget(target);
		pf.addInterface(IMessageWriter.class);
		IMessageWriter proxy = (IMessageWriter) pf.getProxy();
		// write the messages
		proxy.writeMessage("esg", "sks");

	}

}
