package edu.htu.adv.assignment.Strategy;

public class StrategyTest {
	/*
	 * Strategy Pattern shows that a behavior of a class can be changed during run time.
	 * 1. Different objects are created for different behaviors (strategies)
	 * 2. Another object (Display in my case) used to show that the behaviors change per strategy object.
	 * 3. This Display Object allows the strategy object to change the execution of the display object.
	 */
	public static void main(String[] args) {
		System.out.println("**Math calculations using Strategy Pattern**");
		
		// The Display will be used to change the strategy behavior of the objects
		Display display = new Display(new Addition());
		System.out.println("5 + 3 = " + display.startCalculation(5, 3));

		display = new Display(new Subtraction());
		System.out.println("5 - 3 = " + display.startCalculation(5, 3));

		display = new Display(new Multiplication());
		System.out.println("5 * 3 = " + display.startCalculation(5, 3));

		display = new Display(new Division());
		System.out.println("5 / 3 = " + display.startCalculation(5, 3));
	}
}
