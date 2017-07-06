package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService { 
	
	public boolean validateData(float principal, int tenure, int age, String gender)
	{
		try {
			if(principal < 500 && !(tenure == 5 || tenure == 10) && !(age > 1 && age < 100) && !( gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) )
				throw new BankValidationException();
		}
		catch(BankValidationException exp)
		{
		return false;
		}
		return true; 
	}

	public void calculate(float principal,int tenure, int age, String gender)
	{
		if(validateData(principal, tenure, age, gender))
		{
			RDAccount rd = new RDAccount(tenure, principal);
			rd.setInterest(age, gender);
			float maturityInterest = rd.calculateInterest();
			float totalPrincipleDeposited = rd.calculateAmountDeposited();
			float amt = rd.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest);
			System.out.println("The interest is "+maturityInterest);
			System.out.println("The principal is "+totalPrincipleDeposited);
			System.out.println("The amount is "+amt);
			
		}
	}
}
