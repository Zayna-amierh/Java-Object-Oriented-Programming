package edu.htu.adv.assignment.Adapter;

public class Apple {
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// Get Apple's Colour and Weight
	public void getAInfo(String str, int w) {
		System.out.println("Apple colour is: " + str);
		System.out.println("Apple weight is: " + w);
	}
	
}
	 

