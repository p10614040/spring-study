/**
 * 
 */
package com.iceblock.springstudy.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * @author YanLiang
 *
 */
public class ResourceLoad implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月26日 下午9:59:54
	 * @Description 读取资源文件
	 */
	public void resource() {
		Resource resource = this.applicationContext.getResource("config.txt");
		System.out.println(resource.getFilename());
		try {
			System.out.println(resource.contentLength());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
