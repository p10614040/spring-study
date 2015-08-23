/**
 * 
 */
package com.iceblock.springstudy.lifecycel;

import javax.security.auth.DestroyFailedException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author YanLiang
 * <p>bean的init和destroy方法创建方式二：继承InitializingBean, DisposableBean接口，
 * 优先级高于bean配置。</p>
 */

public class BeanLifeCycle implements InitializingBean, DisposableBean{
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午10:00:47
	 * @Description bean 初始化
	 */
	public void start() {
		System.out.println("Bean start.");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午10:01:12
	 * @Description bean 销毁
	 */
	public void stop() {
		System.out.println("Bean stop.");
	}

	/* (non-Javadoc)
	 * @see javax.security.auth.Destroyable#destroy()
	 */
	public void destroy() throws DestroyFailedException {
		System.out.println("Bean destroy.");
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean init.");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午10:00:47
	 * @Description default-init-method 初始化
	 */
	public void defaultInit() {
		System.out.println("Bean defaultInit.");
	}
	
	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午10:01:12
	 * @Description default-destroy-method 销毁
	 */
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy.");
	}
}
