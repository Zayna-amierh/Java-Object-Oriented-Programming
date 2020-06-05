package edu.htu.adv.StudentInformationSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FactoryComponent {
	public static JFrame createJFrame(String title) {
		JFrame frm = new JFrame(title);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(500, 300);
		frm.setLocationRelativeTo(null);
		frm.setLayout(new GridLayout(0,1));
		frm.setResizable(false);
		return frm;
	}
	public static JButton createHomeButton(String title) {
		JButton btn=new JButton(title);
		btn.setForeground(Color.WHITE);	
		btn.setBackground(Color.gray);
		btn.setPreferredSize(new Dimension(350, 60));
		btn.setFont(new Font("Arial",Font.ITALIC,16));
		return btn;
	}
	public static JButton createButton(String title) {
		JButton btn=new JButton(title);
		btn.setForeground(Color.WHITE);	
		btn.setBackground(Color.gray);
		btn.setPreferredSize(new Dimension(200, 40));
		btn.setFont(new Font("Arial",Font.ITALIC,16));
		return btn;
	}
	
	public static JTextField createTextField(int width) {
		JTextField txt=new JTextField(width);
		txt.setPreferredSize(new Dimension(200,30));
		txt.setBorder(BorderFactory.createLineBorder(Color.white));
		txt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				txt.setBackground(Color.white);
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				txt.setBackground(Color.lightGray);
			}
		});
		return txt;
	}
	public static JLabel createLabel(String title) {
		JLabel label=new JLabel(title);
		label.setForeground(Color.BLACK);	
		label.setBackground(Color.lightGray);
		label.setPreferredSize(new Dimension(140, 20));
		label.setFont(new Font("Arial",Font.BOLD,14));
		return label;
	}

	public static JTextArea createTextArea() {
		JTextArea area = new JTextArea();
		area.setPreferredSize(new Dimension(450,150));
		area.setFont(new Font("Arial", Font.PLAIN, 14));
		area.setEditable(false);
		return area;
		
	}
}
