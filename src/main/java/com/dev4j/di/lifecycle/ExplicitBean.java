/**
 * 
 */
package com.dev4j.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mac
 *
 */
public class ExplicitBean {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExplicitBean.class);
	
	public void init() {
		LOGGER.info("Init method.");
	}
	
	public void destroy() {
		LOGGER.info("Destroy Method");
	}
}
