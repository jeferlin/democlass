package com.pro.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyConfiguration {
	@Bean("myBean")		//<bean id="myBean" class="com.MyBean"/>
	public MyBean getMyBean()
	{
		System.out.println("==Get Bean Executed==");
		return new MyBean();
	}
}
