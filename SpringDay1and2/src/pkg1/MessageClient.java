package pkg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MessageClient {

	public static void main(String[] args) 
	{
		// copy beans.xml file in src folder 
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Message msgObj=(Message)beanFactory.getBean("msgObj");
		msgObj.sayHello();
		
	}

}
