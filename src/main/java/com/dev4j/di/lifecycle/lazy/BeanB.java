/**
 * 
 */
package com.dev4j.di.lifecycle.lazy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
@Lazy(false)
public class BeanB {

	private static final Logger LOGGER = LoggerFactory.getLogger(BeanB.class);

	@Autowired
	private BeanA beanA;

	@PostConstruct
	public void init() {
		LOGGER.info("Init bean A.");
	}
}
