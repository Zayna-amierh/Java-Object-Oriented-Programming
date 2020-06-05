package edu.htu.adv.assignment.Facade;

/*
 * The main purpose of the Facade pattern is to hide all the complexities of a system and provide an interface to access the system
 * The pattern contains a single class that provides the simplified methods needed to be called.
 * Structural Design Pattern
 */
public class FacadeTest {
	public static void main(String[] args) {
		System.out.println("Buy a new laptop using Facade Design Pattern");
		
		// Dealer Construction.
		Dealer dealer = new Dealer();
		System.out.println("====================");

		// To buy lenovo laptop
		dealer.lenovopayment();
		System.out.println("====================");

		// To buy dell laptop
		dealer.dellpayment();
		System.out.println("====================");

		// To buy HP laptop
		dealer.hppayment();
		System.out.println("====================");

	}
}
