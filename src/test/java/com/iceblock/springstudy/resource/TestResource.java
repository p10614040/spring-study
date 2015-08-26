/**
 * 
 */
package com.iceblock.springstudy.resource;

import org.junit.Test;

import com.iceblock.springstudy.UnitTestBase;

/**
 * @author YanLiang
 *
 */
public class TestResource extends UnitTestBase {

	/**
	 * @param path
	 */
	public TestResource() {
		super("beanResource.xml");
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月26日 下午10:03:54
	 * @Description 读取资源文件测试
	 */
	@Test
	public void testResource() {
		ResourceLoad resourceLoad = super.getBean("resourceLoad");
		resourceLoad.resource();
	}
}
