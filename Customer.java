package com.gov.javaprogram;

public class Customer 
{
  private String customerName;
  private String accountNumber;
  private double currentBalance;
  
  static String bankName="SBI";
  static String bankAddress="HyderaBad";
  static String bankIFSCCode="SBI53004";
 
 public void setCustomerDetails(String name,String accNumber,double balance)
 {
	 customerName=name;
	 accountNumber=accNumber;
	 currentBalance=balance;
 }
 public void Withdraw(double amount)
 {
	 if(amount<currentBalance && amount>0) 
	 {
		 currentBalance=currentBalance-amount;
		 System.out.println("After withdraw Balance is: "+currentBalance);
		  
	 }else 
		 
	 {
		 System.err.println("You have insufficient balance!");
		 
	 }
 }
 public void Deposite(double amount) {
	 if(amount<0) 
	 {
		 System.err.println(" error message.");
	 }else {
		 currentBalance=currentBalance+amount;
		 System.out.println("After Deposite Balance is: "+currentBalance);
	 }
 }
 
 public double CurrentBalance()
 {
	 return currentBalance;
	// System.out.println("Current Balance is: "+currentBalance);
	 
 }

 public String DisplayDetails() {
	return "Customer:\nCustomerName=" + customerName + "\nAccountNumber=" + accountNumber + 
			"\nCurrentBalance="+ currentBalance +"\nBank Name= "+bankName+"\nBank Address= "
			+bankAddress+"\nBank IFSC Code= "+bankIFSCCode;
 }
 
  
 
}
