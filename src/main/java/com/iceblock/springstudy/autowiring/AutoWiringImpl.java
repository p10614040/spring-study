/**
 * 
 */
package com.iceblock.springstudy.autowiring;

/**
 * @author YanLiang
 *
 */
public class AutoWiringImpl implements AutoWiringDaoInterface {

	/* (non-Javadoc)
	 * @see com.iceblock.springstudy.autowiring.AutoWiringDaoInterface#say(java.lang.String)
	 */
	public void say(String word) {
		
		System.out.println("AutoWiringImpl say : " + word);

	}

}
