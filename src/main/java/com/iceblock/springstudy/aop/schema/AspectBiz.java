/**
 * 
 */
package com.iceblock.springstudy.aop.schema;

/**
 * @author YanLiang
 * 业务类
 */
public class AspectBiz {

	public void biz(String args) {
		System.out.println("i'm biz ... " + args);
		// 测试异常捕获切面 throw new RuntimeException();
	}

	public void biz2(String args) {
		System.out.println("i'm biz2 ... " + args);
		// 测试异常捕获切面 throw new RuntimeException();
	}
}
