/**
 * 
 */
package com.iceblock.springstudy.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author YanLiang
 *
 */
public class ApplicationContextHolder implements ApplicationContextAware,
		BeanNameAware {
	
	private String beanName;
	private ApplicationContext context;

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	 * 获取当前bean资源的名称
	 */
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("当前bean的名称：" + name);
	}

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 * 获取当前bean的Spring上下文
	 */
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月23日 下午11:10:07
	 * @Description 通过Application资源和beanName资源获取当前bean
	 */
	public void getCurrentBean() {
		System.out.println("当前bean的hashCode：" + this.context.getBean(beanName).hashCode());
	}
}
