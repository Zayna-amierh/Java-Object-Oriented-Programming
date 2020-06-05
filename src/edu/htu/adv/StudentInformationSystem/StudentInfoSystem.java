package edu.htu.adv.StudentInformationSystem;

import java.util.Scanner;

/*
 * This is the main class that will be used to call GUI or commandline according to option.
 */
public class StudentInfoSystem {
	public static void main(String[] args) {

		Options choice = new Options();
		Scanner scan = new Scanner(System.in);
		StudentCommandLine cl = new StudentCommandLine();
		GUI gui = new GUI();

		while (true) {

			choice.mainOption();
			int op = scan.nextInt();
			
			// Option(1): Go to Commandline version
			if (op == 1) {
				cl.commandLine();
				
			// Option(2): Go to GUI version
			} else if (op == 2) {
				gui.graphicalUserInterface();
				
			// Option(3): This will leave the entire program
			} else if (op == 3) {
				break;
				
			// Wrong entry will repeat the loop to choose option correctly.
			} else {
				System.out.println("Wrong key pressed! Please try again.");
			}
		}
		scan.close();

	}

}
