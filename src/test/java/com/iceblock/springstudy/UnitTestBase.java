/**
 * 
 */
package com.iceblock.springstudy;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YanLiang
 *
 */
public class UnitTestBase {

	private ClassPathXmlApplicationContext context;
	private String path;
	
	public UnitTestBase(String path){
		this.path = path;
	}
	
	@Before
	public void createContext(){
		context = new ClassPathXmlApplicationContext(this.path);
		context.start();
	}
	
	@After
	public void closeContext() {
		context.close();
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午9:43:44
	 * @Description 根据ID获取bean
	 */
	@SuppressWarnings("unchecked")
	public <T extends Object> T getBean(String beanName){
		return (T)context.getBean(beanName);
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午9:43:28
	 * @Description 根据类型获取bean：有多个同类型bean的时候会异常
	 */
	public <T extends Object> T getBeanType(Class<T> beanType) throws NoUniqueBeanDefinitionException{
		return (T)context.getBean(beanType);
	}
}
