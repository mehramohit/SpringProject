package com.myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.controller.service.ProjectControllerService;
import com.myProject.model.Account;

@RestController
public class ProjectController {

	@Autowired
	private ProjectControllerService pcService;
	
	@RequestMapping("/AddUser")
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE})
	public String addUser(@RequestBody Account input) {
		return pcService.addUser(input);
	}
	
	@RequestMapping("/findUserById")
	public String findUserById(@RequestParam int id) {
		return pcService.findUserById(id);
	}
	
	@RequestMapping("/updateUserAccount")
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE})
	public String updateUserAccount(@RequestBody Account input) {
		return pcService.updateUserAccountByInfo(input);
	}
	
	
}
