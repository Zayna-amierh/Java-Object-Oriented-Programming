package edu.htu.adv.StudentInformationSystem;

import java.util.Scanner;

/*
 * This is the commandline class that will call methods needed from student and adapt to the commandline accordingly.
 * All data will be read and written to the CSV file using the FileHandler class and the arraylist.
 * Methods are called from the Student class.
 */
public class StudentCommandLine {
	
	public void commandLine() {
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		FileHandler fh = FileHandler.getInstance();
		int id;
		String name;
		double avg;

		Options choice = new Options();

		fh.readFromFile(std.stdList);
		System.out.println("------------------------------------------");
		System.out.println("Student Information System CommandLine");
		while (true) {
			choice.option();
			int op = scan.nextInt();
			
			// Option(1): Add Student to Information System
			if (op == 1) {
				System.out.println("--------------Add Student-----------------");
				System.out.println("------------------------------------------");
				System.out.print("Please enter student id: ");
				id = scan.nextInt();

				System.out.print("Student name: ");
				name = scan.next();

				System.out.print("Student Average: ");
				avg = scan.nextDouble();
				if (id > 0 && (avg >= 50 && avg <= 100)) {
					std.addStudent(id, name, avg);
					System.out.println("Student has been added successfully!!");
				} else {
					System.out.println("Invalid entry of ID, name or average. Please click 1 and try again");
				}
				System.out.println("------------------------------------------");
				
			// Option(2): Find Student by ID from Information System
			} else if (op == 2) {
				System.out.println("--------------Find Student by ID----------");
				System.out.println("------------------------------------------");
				System.out.print("Please enter student id: ");
				id = scan.nextInt();
				var result = std.findStudent(id);
				if (result!= null && id == result.getId()) {
					System.out.println("Student ID: " + result.getId());
					System.out.println("Student Name: " + result.getName());
					System.out.println("Student Average: " + result.getAvg());
				
				}else {
					System.out.println("No Data Found!");
				}
			
			// Option(3): Delete Student by ID from Information System
			} else if (op == 3) {
				System.out.println("--------------Delete Student--------------");
				System.out.println("------------------------------------------");
				System.out.println("Please enter student id: ");
				id = scan.nextInt();
				std.deleteStudent(id);
				System.out.println("Student has been deleted successfully");
				System.out.println("------------------------------------------");

			// Option(4): Show All Students saved in Information System
			} else if (op == 4) {
				System.out.println("--------------All Students----------------");
				System.out.println("------------------------------------------");
				System.out.println("ID\t\tName\t\tAverage:");
				System.out.println("------------------------------------------");
				var result =std.showAllStudent();
				for(Student std1:result) {
					System.out.println(std1.getId()+"\t\t"+std1.getName()+"\t\t"+std1.getAvg());
				}
				System.out.println("------------------------------------------");
			
			// Option(5): Exit Application
			} else if (op == 5) {
				break;
			
			// Option(6): Wrong Entry therefore, repeat and choose option correctly.	
			} else {
				System.out.println("Wrong key pressed! Please try again.");
			}
		}

	}

}
