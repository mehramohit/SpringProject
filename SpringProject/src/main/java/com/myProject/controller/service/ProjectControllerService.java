package com.myProject.controller.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.controller.service.util.AccountTools;
import com.myProject.model.Account;

@Service
public class ProjectControllerService {

	@Autowired
	private AccountTools accTools;
	
	private HashMap<Integer, Account> accountHash = new HashMap<Integer, Account>();
	private int accountId = 1000;

	public String addUser(Account input) {
		if (input != null) {
			if (accountHash.get(accountId) == null) {
				accountHash.put(accountId, input);
				accountId += 1;
			} else {
				return "Internal Error, Account Id already exists";
			}
			return "Account Added with id:" + accountId;
		} else
			return "Input invalid";
	}

	public String findUserById(int id) {
		Account a = accountHash.get(id);
		if (a == null) {
			return "User not found, check id";
		} else
			return a.toString();
	}
	
	
	
	public String updateUserAccountByInfo(Account input) {
		Account a = accTools.findAccount(input);
		if(a != null)
		{
			
		}
		else {
			
		}
		
	}
}
