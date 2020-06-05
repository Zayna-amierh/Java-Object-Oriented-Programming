package edu.htu.adv.assignment.Strategy;
/*
 * Concrete Classes are made to implement the interface "Calculation"
 */

public class Addition implements Calculation {
	@Override
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}

}
