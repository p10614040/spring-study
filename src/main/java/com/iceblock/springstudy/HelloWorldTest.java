/**
 * 
 */
package com.iceblock.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YanLiang
 *
 */
public class HelloWorldTest {

	/**
	 * @author yan.liang
	 * @date 2015年8月21日 下午10:25:27
	 * @Description spring实例化简单测试
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"bean.xml");
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.sayHello();
		
	}

}
