/**
 * 
 */
package com.iceblock.springstudy;

import org.junit.Test;

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
	}
}
