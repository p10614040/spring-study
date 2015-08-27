/**
 * 
 */
package com.iceblock.springstudy.autowiring;

/**
 * @author YanLiang
 *
 */
public class AutoWiringService {

	/* 自动装配按照名称时，属性名必须与bean的id相同 ，有相应的setter方法 */
	private AutoWiringDao autoWiringDao;
	private AutoWiringDaoInterface autoWiringImpl;
	
	/*除非使用构造器自动装配或者有属性注入，否则必须有默认构造器方法*/
	public AutoWiringService() {
	}

	public AutoWiringService(AutoWiringDao autoWiringDao, AutoWiringDaoInterface autoWiringImpl2) {
		this.autoWiringDao = autoWiringDao;
		this.autoWiringImpl = autoWiringImpl2;
	}

	/**
	 * @author yan.liang
	 * @date 2015年8月26日 下午9:16:44
	 * @Description 自动装配
	 */
	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}

	public void say(String word) {
		this.autoWiringDao.say(word);
		this.autoWiringImpl.say(word);
	}
}
