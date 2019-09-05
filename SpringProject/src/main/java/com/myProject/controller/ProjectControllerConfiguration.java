package com.myProject.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myProject.controller.service.util.AccountTools;

@Configuration
public class ProjectControllerConfiguration {

	
	@Bean
	public AccountTools AccountToolsManager() {
		return new AccountTools();
	}
}
