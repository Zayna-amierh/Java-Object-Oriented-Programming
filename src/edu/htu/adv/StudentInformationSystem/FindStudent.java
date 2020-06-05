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
 * This is the Find Student Panel Frame that is used to either find a student by ID or delete the student
 */
public class FindStudent {
Student std = new Student();
FileHandler fh = FileHandler.getInstance();
	
	public FindStudent() {
		fh.readFromFile(std.stdList);
		JFrame frm = FactoryComponent.createJFrame("Find Or Delete Student");
		
		JLabel labelId = FactoryComponent.createLabel("Student ID:");
		JTextField textId = FactoryComponent.createTextField(25);
		
		JLabel labelName = FactoryComponent.createLabel("Student Name:");
		JTextField textName = FactoryComponent.createTextField(25);
		textName.setEditable(false);
		
		JLabel labelAvg = FactoryComponent.createLabel("Student Average:");
		JTextField textAvg = FactoryComponent.createTextField(25);
		textAvg.setEditable(false);
		
		JButton FindStudent = FactoryComponent.createButton("Find");
		FindStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int gId = Integer.parseInt(textId.getText());
				Student result =std.findStudent(gId);
				int id = result.getId();
				if(result!=null && gId == id) {
				String tName = result.getName();
				textName.setText(tName);
				double tAvg = result.getAvg();
				textAvg.setText(String.valueOf(tAvg));
				} else {
					JOptionPane.showMessageDialog(null, "No Student was found");
					textId.setText("");
					textName.setText("");
					textAvg.setText("");
				}
			}
		});
		
		JButton DeleteStudent = FactoryComponent.createButton("Delete");
		DeleteStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int gId = Integer.parseInt(textId.getText());
				std.deleteStudent(gId);
				JOptionPane.showMessageDialog(null, "Delete Student Successfully");
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
		
		JPanel findPanel = new JPanel();
		findPanel.add(labelId);
		findPanel.add(textId);
		findPanel.add(labelName);
		findPanel.add(textName);
		findPanel.add(labelAvg);
		findPanel.add(textAvg);
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(FindStudent);
		btnPanel.add(DeleteStudent);
		btnPanel.add(Back);
		
		frm.add(findPanel);
		frm.add(btnPanel);
		frm.setVisible(true);
		
	}

}
