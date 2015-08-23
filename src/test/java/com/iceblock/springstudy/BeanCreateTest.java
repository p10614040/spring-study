/**
 * 
 */
package com.iceblock.springstudy;

import org.junit.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;

/**
 * @author YanLiang
 *
 */
public class BeanCreateTest extends UnitTestBase{

	/**
	 * @param path
	 */
	public BeanCreateTest() {
		super("bean.xml");
	}
	
	@Test
	public void beanCreate(){
		HelloWorld helloWorld = super.getBean("helloWorld");
		helloWorld.sayHello();
		
		HelloWorld helloWorld2 = null;
		try {
			helloWorld2 = super.getBeanType(HelloWorld.class);
			helloWorld2.sayHello();
		} catch (NoUniqueBeanDefinitionException e) {
			System.err.println("存在多个同类型的bean");
			e.printStackTrace();
		}
	}
}
