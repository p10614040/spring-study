/**
 * 
 */
package com.iceblock.springstudy.aware;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class ApplicationContextHolderTest extends UnitTestBase{

	/**
	 * @param path
	 */
	public ApplicationContextHolderTest() {
		super("beanAware.xml");
	}

	/**
	 * Test method for {@link com.iceblock.springstudy.aware.ApplicationContextHolder#getCurrentBean()}.
	 * <p>测试ApplicationContextAware接口</p>
	 */
	@Test
	public void testGetCurrentBean() {
		ApplicationContextHolder aHolder = super.getBean("awareBean");
		System.out.println("获取到的bean的hashcode：" + aHolder.hashCode());
		aHolder.getCurrentBean();
	}

}
