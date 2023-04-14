package org.tcs;

public class Company extends Employee{
	
	private void companyName() {
System.out.println("Wipro");}
	
	private void companyId() {
System.out.println("710524");}
	
	public static void main(String[] args) {
		Company c=new Company();
		
		c.clientName();
		c.clientId();
		c.employeeName();
		c.employeeId();
		c.companyName();
		c.companyId();
		
  }
	}
