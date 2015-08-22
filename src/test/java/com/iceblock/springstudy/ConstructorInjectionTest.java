/**
 * 
 */
package com.iceblock.springstudy;

import org.junit.Test;

import com.iceblock.springstudy.injection.InjectionService;

/**
 * @author YanLiang
 *
 */
public class ConstructorInjectionTest extends UnitTestBase{

	/**
	 * @param path
	 * Junit 必须有一个无参构造器供调用实例化
	 */
	public ConstructorInjectionTest() {
		super("classpath*:beanConstructorInjection.xml");
	}

	@Test
	public void TestInjection(){
		InjectionService service = super.getBean("injectionService");
		service.save("Yan.liang");
	}
	
}
