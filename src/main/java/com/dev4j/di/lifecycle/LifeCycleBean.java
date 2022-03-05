/**
 * 
 */
package com.dev4j.di.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author mac
 *
 */
@Component
//@Scope("prototype") -> Recordemos que Predestroy no se ejecuta para Beans de tipo Prototype.
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(LifeCycleBean.class);

	// Se ejecuta durante la contrucciòn del Bean
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
	public void destroyBean() {
		LOGGER.info("Pre destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("After properties set method.");
	}

	@Override
	public void destroy() throws Exception {
		LOGGER.info("Destroy method.");
	}

}
