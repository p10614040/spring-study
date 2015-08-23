/**
 * 
 */
package com.iceblock.springstudy.lifecycle;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class TestBeanLifeCycle extends UnitTestBase {

	/**
	 * @param path
	 */
	public TestBeanLifeCycle() {
		super("beanLifeCycle.xml");
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午10:27:04
	 * @Description 测试bean的init和destroy
	 * <p>如果没有设置lazy-init=true，bean会默认加载，都不需要get</p>
	 */
	@Test
	public void test1() {
		// super.getBean("beanLifeCycel");
	}
}
