package edu.htu.adv.StudentInformationSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This class contains everything needed for the commandline and GUI in terms of methods.
 */
public class Student {
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> stdList = new ArrayList<Student>();
	FileHandler fh = FileHandler.getInstance();
	private int id;
	private String name;
	private double avg;

	public Student() {

	}

	public Student(int id, String name, double avg) {
		this.id = id;
		this.name = name;
		this.avg = avg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	// Add Student method.
	public void addStudent(int id, String name, double avg) {
		stdList.add(new Student(id, name, avg));
		fh.writeToFile(stdList);
	}
	
	// Find Student by ID method.
	public Student findStudent(int id) {
		Student result = new Student();
		for (Student student : stdList) {
			if (student.getId() == id) {
				result.id = student.getId();
				result.name = student.getName();
				result.avg = student.getAvg();
			}
		}
		return result;

	}
	
	// Delete Student by ID method.
	public void deleteStudent(int id) {

		boolean n = stdList.removeIf(st -> (st.getId() == id));
		if (n == true) {
			fh.writeToFile(stdList);
		}
	}

	// Show all Students from arrayList
	public ArrayList<Student> showAllStudent() {

		return stdList;

	}
	
	//  Format method for returning out of file as String.
	public String outFileString() {
		return (getId() + "," + getName() + "," + getAvg());
	}
	

}
