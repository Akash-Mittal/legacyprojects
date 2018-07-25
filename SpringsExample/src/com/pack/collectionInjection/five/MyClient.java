package com.pack.collectionInjection.five;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.EnumerablePropertySource;

public class MyClient {
// Collections inside Bean
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/collectionInjection/five/E5Bean.xml");
		CollectionBean bean = (CollectionBean) context.getBean("coll5");
		
		ArrayList<String> product = (ArrayList<String>) bean.getProductList();
		Map prices = bean.getPricesMap();
		for(String i : product)
		{
			System.out.println(i +"----" +prices.get(i));
		}
 		
		Set<String> productset = bean.getProductSet();
		Iterator<String > it = productset.iterator();
		while(it.hasNext())System.out.println(it.next());
		
		
		Properties props = bean.getDescription();
		Enumeration<Object> desc= props.keys();
		while(desc.hasMoreElements()){
			String temp = desc.nextElement().toString();
			System.out.println(temp+" : "+props.getProperty(temp));
		}
		
		 
	}
	
	
}
