package edu.htu.adv.assignment.Strategy;

public class Division implements Calculation {

	@Override
	public int calculate(int n1, int n2) {
		return n1 / n2;
	}

}
