package com.myProject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.controller.service.ProjectControllerService;
import com.myProject.model.Account;

@RestController
public class ProjectController {

	@Autowired
	private ProjectControllerService pcService;
	
	@RequestMapping("/AddUser")
	public String addUser(@Valid @RequestBody Account input) {
		return pcService.addUser(input);
	}
}
