package com.zll.test;

import com.zll.test.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

	@Bean
	public Person person(){
		Person person = new Person();
		person.setName("zll");
		return person;
	}
}
