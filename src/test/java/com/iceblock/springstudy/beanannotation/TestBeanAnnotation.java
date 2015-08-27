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
	 * @Description 测试基于注解自动注入
	 */
	@Test
	public void testBanAnnontation() {
		InjectionService injectionService = super.getBean("injectionServiceImpl");
		injectionService.save("autowired 注解注入");
	}
}
