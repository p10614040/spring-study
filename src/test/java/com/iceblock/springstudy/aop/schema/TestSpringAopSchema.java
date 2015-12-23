/**
 * 
 */
package com.iceblock.springstudy.aop.schema;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class TestSpringAopSchema extends UnitTestBase {

	/**
	 * @param path
	 */
	public TestSpringAopSchema() {
		super("spring-aop-schema.xml");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:26:51
	 * @Description 测试切面类自己
	 * <p>结论：切面类自己无法实现切面</p>
	 */
	@Test
	public void testAspectSelf() {
		MoocAspect moocAspect = super.getBean("moocAspect");
	}

	@Test
	public void testAspect(){
		AspectBiz aspectBiz = super.getBean("aspectBiz");
		aspectBiz.biz("biz");
		aspectBiz.biz2("biz2");
	}
}
