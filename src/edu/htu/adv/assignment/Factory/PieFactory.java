package edu.htu.adv.assignment.Factory;

public class PieFactory {

	    public static Pie pie(String flavor) {
	    	if (flavor.equals("Apple")) {
	    		return new ApplePie();
			}
	    	else if (flavor.equals("Blueberry")) {
	    		return new BlueberryPie();
			}
	    	else if (flavor.equals("Strawberry")) {
	    		return new StrawberryPie();
			}
			return null;
	}
}
