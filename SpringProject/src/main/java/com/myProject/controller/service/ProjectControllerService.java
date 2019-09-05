package com.myProject.controller.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.controller.service.exceptions.AccountServiceException;
import com.myProject.controller.service.util.AccountTools;
import com.myProject.enums.Province;
import com.myProject.model.Account;
import com.myProject.model.Address;

@Service
public class ProjectControllerService {

	@Autowired
	private AccountTools accTools;

	private HashMap<Integer, Account> accountHash = new HashMap<Integer, Account>();
	private int accountId = 1000;

	public ProjectControllerService() {
		System.out.println("Injected......");
		for(int i=0; i<4; i++) {
			Account a = new Account();
			a.setUserName("mmehra" + i);
			a.setFirstName("Mohit" + i);
			a.setLastName("Mehra" + i);
			a.setAddress(new Address().setUnitNumber(1408).setStreetAddress("225 Sackville Street "+i).setProvince(Province.Ontario).setPostalCode("M5A0B9").setCity("Toronto"));
			accountHash.put(accountId+i, a);
		}
		System.out.println(accountHash.toString());
	}

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
		Account a;
		try {
			Integer i = accTools.findAccountKey(input, accountHash);
			if (i != null) {
				a = accountHash.get(i);

				a.setFirstName(input.getFirstName());
				a.setLastName(input.getLastName());
				a.setAddress(input.getAddress());
				a.setUserName(input.getUserName());
				accountHash.put(i, a);
				return "Account updated";
			} else {
				return "Account not found";
			}

		} catch (AccountServiceException e) {
			e.printStackTrace();
			return "Exception in UpdateAccount";
		}

	}
}
