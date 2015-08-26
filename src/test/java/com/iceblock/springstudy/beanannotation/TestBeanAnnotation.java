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
public class TestBeanAnnotation extends UnitTestBase {

	/**
	 * @param path
	 */
	public TestBeanAnnotation() {
		super("beanAnnotation.xml");
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月26日 下午10:36:41
	 * @Description 测试基于注解的bean的创建
	 */
	@Test
	public void testBanAnnontation() {
		BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.say(" annontation test");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月26日 下午10:37:31
	 * @Description 测试基于注解的scope
	 */
	@Test
	public void testBanAnnontationScope() {
		BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.printMyHashCode();
		
		beanAnnotation = super.getBean("beanAnnotation");
		beanAnnotation.printMyHashCode();
	}
}
