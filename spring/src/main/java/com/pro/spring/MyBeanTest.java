package com.pro.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MyBeanTest {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.pro.spring");
		context.refresh();
		
		
		MyBean myBean=(MyBean)context.getBean("myBean");
		System.out.println("do it");
		myBean.display();	
	}
}
