/**
 * 
 */
package com.dev4j.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware{

	private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBean.class);
	
	@Override
	public void setBeanName(String name) {
		LOGGER.info("Bean name aware {}", name);
	}
	
	// Se ejecutara despues de la inyecciòn de dependencias.
	@PostConstruct
	public void init() {
		LOGGER.info("Post Contruct.");
	}
	
	// Se ejecutar antes de que el Bean sea destruido.
	// No se ejecutan para Bean Prototype.
	// Solo se ejecutan durante una terminaciòn de la VM de forma normal.
	@PreDestroy
	public void destroy() {
		LOGGER.info("Pre destroy");
	}

}
