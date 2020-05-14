package com.nineleaps.springbootdependsOnannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.nineleaps.springbootdependsOnannotation.model.BeanOne;
import com.nineleaps.springbootdependsOnannotation.model.BeanThree;
import com.nineleaps.springbootdependsOnannotation.model.BeanTwo;

@Configuration
public class AppConfig 
{
	@Bean(name = "beanOne")
	@DependsOn(value = {"beanTwo", "beanThree"})
	public BeanOne getBeanOne()
	{
		return new BeanOne();
	}
	
	@Bean(name = "beanTwo")
	public BeanTwo getBeanTwo()
	{
		return new BeanTwo();
	}
	
	@Bean(name = "beanThree")
	public BeanThree getBeanThree()
	{
		return new BeanThree();
	}
}
