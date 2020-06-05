package edu.htu.adv.assignment.Template;

public abstract class CakeRecipe {
	
	// Template method is final so subclasses can't override
	public final void makeCake() {
		addEggs();
		addSugar();
		addMilk();
		addFlour();
		addFlavor();
		System.out.println("\tCake has been baked!");
	}

	// Methods to be implemented by subclasses

	public abstract void addEggs();

	public abstract void addSugar();

	public abstract void addMilk();

	public abstract void addFlour();
	
	public abstract void addFlavor();

}