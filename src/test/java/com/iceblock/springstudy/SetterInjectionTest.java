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
public class SetterInjectionTest extends UnitTestBase{

	/**
	 * @param path
	 * Junit 必须有一个无参构造器供调用实例化
	 */
	public SetterInjectionTest() {
		super("classpath*:beanSetterInjection.xml");
	}

	@Test
	public void TestInjection(){
		InjectionService service = super.getBean("injectionService");
		service.save("Yan.liang");
	}
	
}
