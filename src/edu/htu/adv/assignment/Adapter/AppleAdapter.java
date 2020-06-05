package edu.htu.adv.assignment.Adapter;
/*
 * This is the adapter which is used to allow both incompatible classes (Apple and Orange) to work together
 */
public class AppleAdapter extends Apple {
	private Orange orange;

	public AppleAdapter(Orange orange) {
		this.orange = orange;
	}
 
	public void getAInfo(String str, int w) {
		orange.getOInfo(str, w);
	}
	
}
