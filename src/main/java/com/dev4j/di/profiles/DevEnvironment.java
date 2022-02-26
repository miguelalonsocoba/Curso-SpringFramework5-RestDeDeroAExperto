package com.dev4j.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = {"dev", "default "}) // Se active el perfil de acuardo al entorno
public class DevEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "DEV";
	}

}
