/**
 * 
 */
package com.dev4j.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
public class LifeCycleBean implements BeanNameAware{

	private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBean.class);
	
	@Override
	public void setBeanName(String name) {
		LOGGER.info("Bean name aware {}", name);
	}
	
	@PostConstruct
	public void init() {
		LOGGER.info("Post Contruct.");
	}
	
	@PreDestroy
	public void destroy() {
		LOGGER.info("Pre destroy");
	}

}
