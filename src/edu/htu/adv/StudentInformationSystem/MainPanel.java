package edu.htu.adv.StudentInformationSystem;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * This Main Panel will display the first frame (Home) and this will contain 4 buttons to decide on the following:
 * 1. Add Student
 * 2. Find or Delete Student
 * 3. Show All Students
 * 4. Quit Program 
 */
public class MainPanel {
	
	Student std = new Student();
	FileHandler fh = FileHandler.getInstance();

	public MainPanel() {
		fh.readFromFile(std.stdList);
		
		JFrame frm = FactoryComponent.createJFrame("Student Information System");
		
		
		JButton AddStudent = FactoryComponent.createHomeButton("Add Student");
		AddStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				new AddStudent();
				
			}
		});
		JButton FindStudent = FactoryComponent.createHomeButton("Find Student");
		FindStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				new FindStudent();
				
			}
		});
		JButton ShowAllStudent = FactoryComponent.createHomeButton("Show All Students");
		ShowAllStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				new ShowAllStudent();
				
			}
		} );
		JButton QuitStudent = FactoryComponent.createHomeButton("Quit");
		QuitStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				
			}
		});
		JPanel mainPanel = new JPanel();
		mainPanel.add(AddStudent);
		mainPanel.add(FindStudent);
		mainPanel.add(ShowAllStudent);
		mainPanel.add(QuitStudent);
		
		frm.add(mainPanel);
		frm.setVisible(true);
	}
	
	
	
}
		
