package edu.htu.adv.assignment.Template;

public class TemplateTest {
	/*
	 * The Template Method is a method which has all the processes with every action
	 * encapsulated in the operation(function) so every operation can be overridden in
	 * subclasses so processes can be changed according to needs
	 */
	
	public static void main(String[] args) {
		System.out.println("**Baking a Cake using Template Method**\n");
		System.out.println("Baking a Vanilla Cake\n");
		CakeRecipe cake = new VanillaCake();
		cake.makeCake();

		System.out.println("**********************************************");

		System.out.println("Baking a Chocolate Cake\n");
		cake = new ChocolateCake();
		cake.makeCake();

	}

}
