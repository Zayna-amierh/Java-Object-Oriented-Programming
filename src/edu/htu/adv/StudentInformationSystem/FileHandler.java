package edu.htu.adv.StudentInformationSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.ArrayList;

/*
 * This file contains all the methods that are needed to read and write to the CSV file in the name(student.csv).
 * The Design Pattern singleton is used here in the filehandler to allow only one global access to the filehandler,
 * This making sure that only single object gets created. This class provides a way to access its only object which 
 * can be accessed directly without need to instantiate the object of the class.
 */
public class FileHandler {
	private static FileHandler instance = new FileHandler();
	private static String fileName = "student.csv";
	ArrayList<Student> stdList;


	public static FileHandler getInstance() {
		return instance;
	}

	private FileHandler() {

	}
	
	// Write to the CSV File.
	public void writeToFile(ArrayList<Student> stdList) {
		try {
			File file = new File(fileName);
			FileWriter fileWriter = new FileWriter(file); // A stream that connects to the csv file
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Connect the FileWriter to the BufferedWriter
			
			// Goes through arraylist to write the values and add delimeters after each entry (column and row)
			for (Student student : stdList) {
				bufferedWriter.write(String.valueOf(student.getId()));
				bufferedWriter.write(",");
				bufferedWriter.write(student.getName());
				bufferedWriter.write(",");
				bufferedWriter.write(String.valueOf(student.getAvg()));
				bufferedWriter.write("\n");
			}

			bufferedWriter.close(); // Close the stream
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method used to read from file.
	public void readFromFile(ArrayList<Student> stdList) {
		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file); // A stream that connects to the text file
			BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the
																			// BufferedReader

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				// Get all tokens available in line
				String[] tokens = line.split(",");
				if (tokens.length > 0) {
					// Create a new student object and fill his data
					Student student = new Student(Integer.parseInt(tokens[0]), tokens[1],
							Double.parseDouble(tokens[2]));
					stdList.add(student);
				}
			}

			bufferedReader.close(); // Close the stream
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
