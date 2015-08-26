/**
 * 
 */
package com.iceblock.springstudy.autowiring;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class TestAutoWiring extends UnitTestBase {

	/**
	 * @param path
	 */
	public TestAutoWiring() {
		super("beanAutoWiring.xml");
	}

	@Test
	public void test1(){
		AutoWiringService service = super.getBean("autoWiringService");
		service.say("test autowiring");
	}
}
