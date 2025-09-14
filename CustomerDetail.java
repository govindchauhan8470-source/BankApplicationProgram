package com.gov.javaprogram;
import java.util.Scanner;
public class CustomerDetail {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Customer raj=new Customer();
			
		System.out.print("Enter the Customer Name:  ");
		String name=sc.nextLine();
		if(name==null)
		{
			System.err.println("Name cannot be null");
			System.exit(0);
		}
		
		System.out.print("Enter the Account Number: ");
		String account=sc.nextLine();
		if(account.length()>16 || account.length()<16)
		{
			System.err.println("Account Number must be 16 Caracter Only!!");
			System.exit(0);
		}
		
		
		System.out.print("Enter the Current Balance: ");
		double balance=Double.parseDouble(sc.nextLine());
		
		
		
		System.out.println("Enter withdraw Amount: ");
		double withdraw=Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Deposite Amount: ");
		double deposite=Double.parseDouble(sc.nextLine());
				
		
		raj.setCustomerDetails(name, account, balance);
		
		raj.Withdraw(withdraw);
		raj.Deposite(deposite);
		//raj.currentBalance();
		System.out.println(raj.DisplayDetails());
		sc.close();
		
		
	

	}

}
