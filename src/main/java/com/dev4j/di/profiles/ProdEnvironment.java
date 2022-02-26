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
@Profile("prod") // Se active el perfil de acuardo al entorno
public class ProdEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "PROD";
	}

}
