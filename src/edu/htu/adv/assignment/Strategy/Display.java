package edu.htu.adv.assignment.Strategy;

/*
 * The display class is used to see the occurring behavior changes according to 
 * the change in clc which is the behavior/strategy
 */
public class Display {
	private Calculation clc;

	public Display(Calculation clc) {
		this.clc = clc;
	}

	public int startCalculation(int num1, int num2) {
		return clc.calculate(num1, num2);
	}

}
