/**
 * 
 */
package com.iceblock.springstudy.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author YanLiang
 * 基于注解的bean
 */
@Scope("prototype")
@Component
public class BeanAnnotation {

	public void say(String word) {
		System.out.println("BeanAnnotation Say : " + word);
	}
	
	public void printMyHashCode() {
		System.out.println("BeanAnnotation HashCode : " + this.hashCode());
	}
}
