package com.wipro.bank.acc;

public class RDAccount extends Account {
	
	public RDAccount(int tenure, float principal)
	{
		this.tenure = tenure; 
		this.principal = principal; 
	}
	
	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		double interest = 0.0; 
		float r = 1 + rateOfInterest/400; 
		float t = 0.0f;
		int i = tenure * 12;
		while(i > 0)
			{ 
			 t = ((float)i/3.0f); 
			 interest = interest + principal * ((Math.pow(r, t)) - 1);
			 i--;
			 }
		
		
		return (float) interest;
		
	}

	@Override
	public float calculateAmountDeposited() {
		// TODO Auto-generated method stub
		return (tenure * principal * 12);
	}

	
}
