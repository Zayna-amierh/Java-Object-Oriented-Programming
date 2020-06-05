package edu.htu.adv.StudentInformationSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * This is the Show All Students Frame Panel used to display all the students from file that are in the arraylist
 */

public class ShowAllStudent {
	Student std = new Student();
	FileHandler fh = FileHandler.getInstance();
	
	public ShowAllStudent() {
		fh.readFromFile(std.stdList);
		JFrame frm = FactoryComponent.createJFrame("Show All Students");

		JLabel labelShow = FactoryComponent.createLabel("Show Students");
		JTextArea textShow = FactoryComponent.createTextArea();

		var result = std.showAllStudent();
		for (Student std1 : result) {
			textShow.append(std1.outFileString() + "\n");
		}

		JButton Back = FactoryComponent.createButton("Back");
		Back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frm.dispose();
				new MainPanel();

			}
		});

		JPanel showPanel = new JPanel();
		showPanel.add(labelShow);
		showPanel.add(textShow);
		showPanel.add(Back);

		frm.add(showPanel);
		frm.setVisible(true);

	}

}
