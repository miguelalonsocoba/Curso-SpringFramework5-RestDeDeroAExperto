/**
 * 
 */
package com.dev4j.di.lifecycle.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
@Lazy
public class BeanA {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeanA.class);
	
	@PostConstruct
	public void init() {
		LOGGER.info("Init bean A.");
	}
}
