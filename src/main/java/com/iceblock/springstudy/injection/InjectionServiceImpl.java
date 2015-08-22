/**
 * 
 */
package com.iceblock.springstudy.injection;

/**
 * @author YanLiang
 *
 */
public class InjectionServiceImpl implements InjectionService {
	
	private InjectionDao injectionDao;
	

	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}


	public InjectionServiceImpl() {
	}



	/**
	 * @param injectionDao
	 * injectionDao 必须与配置文件中的 name 相同
	 */
	public InjectionServiceImpl(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}



	/* (non-Javadoc)
	 * @see com.iceblock.springstudy.injection.InjectionService#save()
	 */
	public void save(String message) {
		
		System.out.println("开始保存：" + message);
		injectionDao.save(message);

	}

}
