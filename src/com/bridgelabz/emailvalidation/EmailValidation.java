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

		//uc3 - Ensure . and validate the mandatory 3rd part
		EmailValidation emailCheck3 = new EmailValidation();
		String str3 = ".co";
		emailCheck3.checkTLD(str3);
		
		//uc4 - To check optional user name to be correct
		EmailValidation emailCheck4 = new EmailValidation();
		String str4 = ".xyz";
		emailCheck4.checkOptionalUserName(str4);
		
		//uc5- To check optional domain name 
		EmailValidation emailCheck5 = new EmailValidation();
		String str5 = ".in";
		emailCheck5.checkOptionalDomainName(str5);
	
		//verifying a email id by merging all the use cases
		EmailValidation emailCheck = new EmailValidation();
		String emailAddress = "abc.xyz@bridgelabz.co.in";
		emailCheck.checkFullEmailAddress(emailAddress);		
	}

	// method to verify a full email address 
	private void checkFullEmailAddress(String emailAddress)
	{
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
		if (isMatched) 
		{			
			System.out.println("Email is valid");
		}
		else
		{			
			System.out.println("Email is invalid");
		}
	}

	//check optional domain name should start with . and have only 2 letters 
	private void checkOptionalDomainName(String str5) 
	{
		boolean isMatched = Pattern.compile("([.]{1}[a-zA-Z]{2})?").matcher(str5).matches();
		if (isMatched) 
		{			
			System.out.println("Optional domain name is correct");
		}
		else
		{			
			System.out.println("Optional domain name is not correct");
		}
	}

	// check optional user name that it should start with [ +,-, ., _ ] and then have letters or numbers  
	private void checkOptionalUserName(String str4) 
	{
		boolean isMatched = Pattern.compile("(^[.,+,_,-]{1}[0-9a-zA-Z]+)*").matcher(str4).matches();
		if (isMatched) 
		{			
			System.out.println("Optional user name is correct");
		}
		else
		{			
			System.out.println("Optional user name is not correct");
		}
	}

	//check email TDL should have "." and TDL
	private void checkTLD(String str3) 
	{
		boolean isMatched = Pattern.compile(".[a-zA-Z]{2,3}").matcher(str3).matches();
		if (isMatched) 
		{			
			System.out.println("Top level Domain name is correct");
		}
		else
		{			
			System.out.println("top level Domain name is not correct");
		}
	}

	//check email should have @ and have domain name
	private void checkDomainName(String str2)
	{
		boolean isMatched = Pattern.compile("@[0-9a-zA-Z]+").matcher(str2).matches();
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
