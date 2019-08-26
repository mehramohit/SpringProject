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
			int id = Math.abs(rand.nextInt());
			accountHash.put(id, input);
			return "Account Added with id:" + id;
		}
		else
			return "Input invalid";
	}
	
	public String findUserById(int id) {
		Account a = accountHash.get(id);
		if(a == null) {
			return "User not found, check id";
		}
		else
			return a.toString();
	}
}
