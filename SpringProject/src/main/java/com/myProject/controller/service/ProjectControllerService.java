package com.myProject.controller.service;

import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.myProject.model.Account;

@Service
public class ProjectControllerService {

	private HashMap<Integer , Account> accountHash = new HashMap<Integer, Account>();
	private Random rand = new Random();
	
	public String addUser(Account input) {
		if(input != null) {
			accountHash.put(rand.nextInt(), input);
			return "Account Added";
		}
		else
			return "Input invalid";
	}
}
