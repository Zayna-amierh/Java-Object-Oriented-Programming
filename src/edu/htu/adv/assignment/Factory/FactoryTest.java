package edu.htu.adv.assignment.Factory;

/*
 * The factory method allows us create object without exposing the creation logic to 
 * the client and refer to newly created object using a common interface.
 * This is done by defining an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
 * Creational Design Pattern
 */

public class FactoryTest {

	public static void main(String args[]) {
		System.out.println("Making Pie using Factory Method:");
		System.out.println("********************************");
		Pie blueberry = PieFactory.pie("Blueberry");
		blueberry.makePie();
		System.out.println("=============================");
		Pie strawberry = PieFactory.pie("Strawberry");
		strawberry.makePie();
		System.out.println("=============================");
		Pie apple = PieFactory.pie("Apple");
		apple.makePie();
	}
}