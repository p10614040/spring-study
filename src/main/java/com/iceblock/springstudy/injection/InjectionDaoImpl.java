/**
 * 
 */
package com.iceblock.springstudy.injection;

/**
 * @author YanLiang
 *
 */
public class InjectionDaoImpl implements InjectionDao {

	/* (non-Javadoc)
	 * @see com.iceblock.springstudy.injection.InjectionDao#save()
	 */
	public void save(String message) {
		
		System.out.println("已经保存：" + message);

	}

}
