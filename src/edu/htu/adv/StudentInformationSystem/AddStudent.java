package edu.htu.adv.StudentInformationSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * This is the Add Student Panel Frame used to enter student information to add the student to the information system
 */
public class AddStudent {
	Student std = new Student();
	FileHandler fh = FileHandler.getInstance();
	
	public AddStudent() {
		fh.readFromFile(std.stdList);
		JFrame frm = FactoryComponent.createJFrame("Add Student");
		
		JLabel labelId = FactoryComponent.createLabel("Student ID:");
		JTextField textId = FactoryComponent.createTextField(25);
	
		
		JLabel labelName = FactoryComponent.createLabel("Student Name:");
		JTextField textName = FactoryComponent.createTextField(25);

		
		JLabel labelAvg = FactoryComponent.createLabel("Student Average:");
		JTextField textAvg = FactoryComponent.createTextField(25);
	
		
		JButton AddStudent = FactoryComponent.createButton("Add");
		AddStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int gId = Integer.parseInt(textId.getText());
				String gName = textName.getText();
				double gAvg = Double.parseDouble(textAvg.getText()); 
				std.addStudent(gId, gName, gAvg);
				JOptionPane.showMessageDialog(null, "Successfully Added Student");
				textId.setText("");
				textName.setText("");
				textAvg.setText("");
				
			}
		});
		JButton Back = FactoryComponent.createButton("Back");
		Back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				new MainPanel();
				
			}
		});
		
		JPanel addPanel = new JPanel();
		addPanel.add(labelId);
		addPanel.add(textId);
		addPanel.add(labelName);
		addPanel.add(textName);
		addPanel.add(labelAvg);
		addPanel.add(textAvg);
		addPanel.add(AddStudent);
		addPanel.add(Back);
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(AddStudent);
		btnPanel.add(Back);
		
		frm.add(addPanel);
		frm.add(btnPanel);
		frm.setVisible(true);
		
	}
}

