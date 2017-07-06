package com.wipro.bank.main;

import com.wipro.bank.service.BankService;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter tenure");
		int tenure = s.nextInt();
		System.out.println("Enter principal");
		float principal = s.nextFloat();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter gender");
		String gender = s.next();
		BankService b= new BankService();
		b.calculate(principal, tenure, age, gender);
		s.close();
		
		
	}

}
