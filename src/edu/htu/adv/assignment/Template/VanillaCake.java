package edu.htu.adv.assignment.Template;

public class VanillaCake extends CakeRecipe {

	@Override
	public void addEggs() {
		System.out.println("\tAdding Eggs into bowl and mixing..");
	}

	@Override
	public void addMilk() {
		System.out.println("\tPouring Milk into bowl and mixing..");
	}

	@Override
	public void addSugar() {
		System.out.println("\tAdding Sugar into bowl and mixing");
	}

	@Override
	public void addFlour() {
		System.out.println("\tAdding Flour into bowl and mixing..");

	}
	@Override
	public void addFlavor() {
		System.out.println("\tAdding Vanilla into bowl and mixingto make Chocolate Cake..");

	}

}
