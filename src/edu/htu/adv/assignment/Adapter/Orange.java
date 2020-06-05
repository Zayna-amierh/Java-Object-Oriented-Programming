package edu.htu.adv.assignment.Adapter;

public class Orange {
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// Get Orange's Colour and weight:
	public void getOInfo(String str, int w) {
		System.out.println("Orange colour is: " + str);
		System.out.println("Orange weight is: " + w);
	}
}
