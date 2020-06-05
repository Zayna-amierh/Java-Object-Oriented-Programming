package edu.htu.adv.assignment.Facade;

public class Dell implements LaptopShop {
	// implements is used to access the interface laptopshop
	// The below are the methods that are used in multiple subclasses to print the brand and price.
	@Override  
    public void brand() {  
        System.out.println("Dell");  
    }  
    @Override  
    public void price() {  
    System.out.println("JOD 4500");  
    }  

}
