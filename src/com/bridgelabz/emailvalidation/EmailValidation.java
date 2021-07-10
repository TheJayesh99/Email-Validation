package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;

public class EmailValidation 
{
	public static void main(String[] args) 
	{
		EmailValidation emailCheck = new EmailValidation();

		System.out.println("Welcome to Email Validation");
		String str = "abc";

		emailCheck.checkFirstLetter(str);
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
