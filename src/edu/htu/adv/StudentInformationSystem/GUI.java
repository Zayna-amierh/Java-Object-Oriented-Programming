package edu.htu.adv.StudentInformationSystem;

/*
 * This is the GUI class that calls the Main Panel. in the Main, we will call the GUI through the method mentioned.
 */
public class GUI {
	Student std = new Student();
	FileHandler fh = FileHandler.getInstance();
	public GUI() {

	}
	
	public void graphicalUserInterface() {
		fh.readFromFile(std.stdList);
		new MainPanel();
	}

}
