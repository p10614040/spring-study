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
	private InjectionDao injectionDao2;



	/* (non-Javadoc)
	 * @see com.iceblock.springstudy.injection.InjectionService#save()
	 */
	public void save(String message) {
		
		System.out.println("开始保存：" + message);
		injectionDao2.save(message);

	}

}
