package edu.htu.adv.assignment.Adapter;

/*
 * The main purpose of the Adapter Design Pattern is lets classes work together 
 * These classes  couldn’t before due to incompatibility of interfaces.
 * This is done by wrapping an existing class with a new interface.
 */
public class AdapterTest {
	public static void main(String[] args) {
		// Apple Object construction
		Apple apple = new Apple();
		// Information of the Apple due to the colour and weight
		apple.getAInfo("Red", 3);

		System.out.println("====================");

		// Orange Object construction.
		Orange orange = new Orange();

		// Apple Adapter is created to allow orange class and apple class to work
		// together
		AppleAdapter aa = new AppleAdapter(orange);

		// The below will allow the method operation found in the apple class to work
		// and output the information about orange
		aa.getAInfo("Orange", 4);

	}

}
