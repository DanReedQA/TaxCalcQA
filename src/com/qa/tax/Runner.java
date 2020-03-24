package com.qa.tax;

public class Runner {

	public static void main(String[] args) {

		String username = "John Smith";
		Double amount = 18000.00;

		TaxUser user = new TaxUser();

		System.out.println(user.printUserName("The user name is: " + username));

		System.out.println(user.printSalary("This is you anual salary: " + amount));

		if (amount < 21000) {
			System.out.println(user.taxCalculator("You are paying 10% tax: " + amount * 0.1));
		} else if (amount < 32500) {
			System.out.println(user.taxCalculator("You are paying 20% tax: " + amount * 0.2));
		} else {
			System.out.println(user.taxCalculator("You are paying 40% tax: " + amount * 0.4));
		}
	}
}
