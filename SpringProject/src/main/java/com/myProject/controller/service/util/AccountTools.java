package com.myProject.controller.service.util;

import java.util.HashMap;

import com.myProject.controller.service.exceptions.AccountServiceException;
import com.myProject.model.Account;

public class AccountTools {

	public Integer findAccountKey(Account input, HashMap<Integer, Account> hs) throws AccountServiceException {
		Account temp;

		for (Integer i : hs.keySet()) {
			temp = hs.get(i);
			if (temp.getUserName().equals(input.getUserName())) {
				if (temp.getFirstName().equals(input.getFirstName())) {
					if (temp.getLastName().equals(input.getLastName())) {
						return i;
					}
				}
			}
		}

		return null;
	}

}
