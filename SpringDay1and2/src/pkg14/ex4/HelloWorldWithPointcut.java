package pkg14.ex4;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class HelloWorldWithPointcut {

    public static void main(String[] args) {
	
	MessageWriter target = new MessageWriter();
        // get proxy


        ProxyFactory pf = new ProxyFactory();
        pf.addAdvisor(new DefaultPointcutAdvisor(new SimpleBeforeAdvice()));
        
       //  pf.setTarget(new MessageWriter());
        //pf.addInterface(IMessageWriter.class);
	//IMessageWriter proxy1 = (IMessageWriter)pf.getProxy();
        

	target.writeMessage();


        pf.setTarget(target);
	
        MessageWriter proxy2 = (MessageWriter)pf.getProxy();
        proxy2.writeMessage();
        


        /* pf.setTarget(new ErrorBean());
	pf.addInterface(BeanError.class);
        BeanError proxy3 = (BeanError)pf.getProxy();
        proxy3.hashCode();*/
        
    }
}           
