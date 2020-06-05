package edu.htu.adv.assignment.Facade;

/*
 * The Dealer class contains all the laptops objects to be called in the main without accessing their source code
 */
public class Dealer {
	private LaptopShop lenovo;
	private LaptopShop dell;
	private LaptopShop hp;

	public Dealer() {
		lenovo = new Lenovo();
		dell = new Dell();
		hp = new HP();
	}

	public void lenovopayment() {
		lenovo.brand();
		lenovo.price();
	}

	public void dellpayment() {
		dell.brand();
		dell.price();
	}

	public void hppayment() {
		hp.brand();
		hp.price();
	}
}