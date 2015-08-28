/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class TestConfigBean extends UnitTestBase{

	/**
	 * @param path
	 */
	public TestConfigBean() {
		super("beanAnnotation.xml");
	}

	@Test
	public void testConfigBean() {
//		Store store = super.getBean("getStringStore");
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
		
		DriverManager driverManager = super.getBean("driverManager");
		System.out.println(driverManager.toString());
	}
	
}
