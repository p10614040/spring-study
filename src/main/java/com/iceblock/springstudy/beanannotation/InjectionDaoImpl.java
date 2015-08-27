/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

import org.springframework.stereotype.Repository;

/**
 * @author YanLiang
 * 持久层注解 Repository
 */
@Repository
public class InjectionDaoImpl implements InjectionDao {

	/* (non-Javadoc)
	 * @see com.iceblock.springstudy.injection.InjectionDao#save()
	 */
	public void save(String message) {
		
		System.out.println("已经保存：" + message);

	}

}
