/**
 * 
 */
package com.iceblock.springstudy.aop.schema;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author YanLiang
 * 切面类
 */
public class MoocAspect {

	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:00:36
	 * @Description 方法执行之前通知
	 */
	public void before(JoinPoint point) {
		Object[] args = point.getArgs();
		System.out.println("MoocAspect before method : " + args[0]);
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:32:51
	 * @Description 方法执行之后通知：不管是否有异常都会执行
	 */
	public void after() {
		System.out.println("MoocAspect after method");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:33:08
	 * @Description 方法返回值之后执行：如果程序终端则不会执行
	 */
	public void afterReturning() {
		System.out.println("MoocAspect afterReturning method");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:29:58
	 * @Description 捕获异常
	 */
	public void afterThrowing() {
		System.out.println("MoocAspect afterThrowing method");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年9月6日 下午7:35:55
	 * @Description 环绕执行
	 */
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("MoocAspect around method 1");
	    Object retVal = pjp.proceed();
	    System.out.println("MoocAspect around method 2");
	    return retVal;
	}
}
