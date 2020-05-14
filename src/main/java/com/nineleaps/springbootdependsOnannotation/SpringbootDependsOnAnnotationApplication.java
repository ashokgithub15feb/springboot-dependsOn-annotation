package com.nineleaps.springbootdependsOnannotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nineleaps.springbootdependsOnannotation.config.AppConfig;
import com.nineleaps.springbootdependsOnannotation.model.BeanOne;
import com.nineleaps.springbootdependsOnannotation.model.BeanThree;
import com.nineleaps.springbootdependsOnannotation.model.BeanTwo;

@SpringBootApplication
public class SpringbootDependsOnAnnotationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootDependsOnAnnotationApplication.class, args);
		
	      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      BeanOne beanOne = context.getBean(BeanOne.class);
	     // BeanTwo beanTwo = context.getBean(BeanTwo.class);
	      //BeanThree beanThree = context.getBean(BeanThree.class);
	      
	      
	      beanOne.doSomthing();
	      //beanTwo.doSomthing();
	     // beanThree.doSomthing();
	      
	      context.close();
	}

}
