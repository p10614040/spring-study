/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YanLiang
 *
 */
@Service
public class InjectionServiceImpl implements InjectionService {
	
	@Autowired
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
