/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author YanLiang
 *
 */
@Configuration
@ImportResource(value="classpath:importResourceConfig.xml")
public class StoreConfig {

	@Value("${jdbc.url}")
	private String url;

	@Value(value = "${jdbc.username}")
	private String userName;

	@Value(value = "${jdbc.password}")
	private String passWord;

	@Bean(name = "stringStore", initMethod = "init" )
	public Store getStringStore() {
		return new StringStore();
	}

	@Bean(name = "driverManager")
	public DriverManager getDriverManager() {
		return new DriverManager(url, userName, passWord);
	}
}
