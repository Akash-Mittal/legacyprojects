package pkg5;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pkg5/beans.xml");
		CollectionBean bean = (CollectionBean)context.getBean("colObj");
		System.out.println("product information");
		// list
		ArrayList products=(ArrayList) bean.getProducts();
		
		// map
		Map prices= bean.getPrices();
			for (int i =0;i< products.size();i++){
				String productName= (String)products.get(i);
				System.out.println("Price of" +productName+" is "+ prices.get(productName) );
			}
			// set
			System.out.println("product set");
			HashSet set=(HashSet<String>)bean.getProductSet();
			Iterator<String> itr1=set.iterator();
			while (itr1.hasNext()) {
				String string = (String) itr1.next();
				System.out.println(string);
			}
			
			// properties
			Properties prop=bean.getDescription();
			Enumeration<Object> enum1=prop.keys();
			while (enum1.hasMoreElements()) 
			{
			String pname = enum1.nextElement().toString();
			String pvalue=prop.getProperty(pname);
				System.out.println(pname+"\t"+pvalue);
			}
			System.out.println("");
		
	}

}
