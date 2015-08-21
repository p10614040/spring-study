/**
 * 
 */
package com.iceblock.springstudy;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YanLiang
 *
 */
public class UnitTestBase {

	private ApplicationContext context;
	private String path;
	
	public UnitTestBase(String path){
		this.path = path;
	}
	
	@Before
	public void createContext(){
		context = new ClassPathXmlApplicationContext(this.path);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Object> T getBean(String beanName){
		return (T)context.getBean(beanName);
	}
}
