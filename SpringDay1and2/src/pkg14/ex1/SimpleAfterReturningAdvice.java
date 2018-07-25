package pkg14.ex1;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdvice{

    public static void main(String[] args) 
    {
        MessageWriter target = new MessageWriter();

        // create the proxy
        ProxyFactory pf = new ProxyFactory();

        pf.addAdvice(new AfterReturn());
        
        pf.setTarget(target);
	    pf.addInterface(IMessageWriter.class);
        IMessageWriter proxy = (IMessageWriter) pf.getProxy();

        // write the messages
        proxy.writeMessage("esg","Noida");
       // target.writeMessage();
    }

}           
class AfterReturn  implements AfterReturningAdvice 
{
	 public void afterReturning(Object returnValue, Method method, Object[] args,
	            Object target) throws Throwable {
	        System.out.println("");
	       
	        System.out.println("After method: " + method.getName());
	        if(args!=null)
	        	for(Object obj1:args)
	        		System.out.println(obj1.toString());
	        System.out.println("After returning from the method this line is printed");
	    }
}