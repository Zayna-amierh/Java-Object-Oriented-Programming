package edu.htu.adv.assignment.Singleton;
/*
 * The Singleton design pattern is used by defining a class that has only one instance and provides a global point of access to it
 */
public class SingletonTest {
	public static void main(String[] args) {
		
		// below we will use this in order to access the class through the instance.
		Greetings gr = Greetings.getInstance();

		// show the message
		gr.showMessage();
	}
}
