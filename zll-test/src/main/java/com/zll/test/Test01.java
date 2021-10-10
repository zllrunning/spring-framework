package com.zll.test;

import com.zll.test.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zll
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(123);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		Person person = applicationContext.getBean(Person.class);
		person.sayName();
	}
}
