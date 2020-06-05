package edu.htu.adv.assignment.Singleton;

public class Greetings {
	// an object "gr" is created from the Greetings
	private static Greetings gr = new Greetings();

	// the construction is made private so it is not accessible for initiation.
	private Greetings() {
	}

	// this will be the only object available and it acts as an instance
	public static Greetings getInstance() {
		return gr;
	}

	public void showMessage() {
		System.out.println("Greetings from Zayna's Singleton Example");
	}

}
