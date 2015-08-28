/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

/**
 * @author YanLiang
 *
 */
public class DriverManager {

	private String url;
	private String userName;
	private String passWord;
	
	public DriverManager(String url, String userName, String passWord) {
		this.url = url;
		this.userName = userName;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "DriverManager [url=" + url + ", userName=" + userName
				+ ", passWord=" + passWord + "]";
	}
	
}
