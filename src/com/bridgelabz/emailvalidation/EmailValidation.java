package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;

public class EmailValidation 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Email Validation");
		//uc1 - email should start with letters or number
		EmailValidation emailCheck1 = new EmailValidation();
		String str1 = "abc";
		emailCheck1.checkFirstLetter(str1);
				
		//uc2 - Ensure @ and validate the mandatory 2nd part
		EmailValidation emailCheck2 = new EmailValidation();
		String str2 = "@bridgelabz";
		emailCheck2.checkDomainName(str2);
	}

	//check email should start @ and have domain name
	private void checkDomainName(String str2)
	{
		boolean isMatched = Pattern.compile("^@[a-zA-Z]+").matcher(str2).matches();
		if (isMatched) 
		{			
			System.out.println("Domain name is correct");
		}
		else
		{			
			System.out.println("Domain name is not correct");
		}
	}

	//check email should start with letters or number 
	private void checkFirstLetter(String str)
	{
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+").matcher(str).matches();
		if (isMatched) 
		{			
			System.out.println("Initials letters are correct");
		}
		else
		{			
			System.out.println("Initials letters are not correct");
		}
	}
}
