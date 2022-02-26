/**
 * 
 */
package com.dev4j.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author mac
 *
 */
@Service
@Profile("qa") // Se active el perfil de acuardo al entorno
public class QaEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "QA";
	}

}
