/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

/**
 * @author YanLiang
 * 
 */
public interface InjectionService {
	
	/* 接口中所有变量都被默认修饰为 public static final */
	public static final int i = 1;

	/*接口中所有的方法都被默认修饰为public abstract */
	public abstract void save(String message);
}
