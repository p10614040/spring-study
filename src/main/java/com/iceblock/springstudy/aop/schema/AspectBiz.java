/**
 * 
 */
package com.iceblock.springstudy.aop.schema;

/**
 * @author YanLiang
 * 业务类
 */
public class AspectBiz {

	public void biz() {
		System.out.println("i'm biz ...");
		// 测试异常捕获切面 throw new RuntimeException();
	}
}
