/**
 * 
 */
package com.iceblock.springstudy;

/**
 * @author YanLiang
 *
 */
public class HelloWorld {
	
	static {
		System.out.println("类被加载");
	}
	
	{
		System.out.println("类被实例化");
	}

	public void sayHello(){
		System.out.println("Hello World !");
	}
}
