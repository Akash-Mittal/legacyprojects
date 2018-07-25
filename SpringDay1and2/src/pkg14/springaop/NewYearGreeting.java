package pkg14.springaop;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewYearGreeting implements Greeting {
    public String message1(String target) {
        System.out.println("From SpringAOP message1::" + target) ;
        return target ;
    }
    public String message2(String target) {
        System.out.println("From SpringAOP message2::" + target) ;
        return target ;
    }
    public static void main(String[] args) {
        ApplicationContext context =
        new ClassPathXmlApplicationContext("classpath:pkg14/springaop/AOP.xml");
        Greeting sprg = (Greeting) context.getBean("greetbean");
        
        sprg.message1("Happy new year ") ;
       
   }
} 

