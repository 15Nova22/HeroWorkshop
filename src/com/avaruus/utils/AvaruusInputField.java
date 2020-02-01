package com.avaruus.utils;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class AvaruusInputField extends JPanel {
	
	private JTextField txtInputfield;

	/**
	 * Create the panel.
	 */
	public AvaruusInputField(Dimension size, String name) {
		setLayout(null);
		
		
		JLabel lblLabel = new JLabel(name);		
		lblLabel.setSize(size);
		lblLabel.setBounds(0, 0, size.width / 2, size.height);
		add(lblLabel);
		
		
		txtInputfield = new JTextField();
		txtInputfield.setSize(size);
		txtInputfield.setBounds(size.width /2, 0, size.width / 2, size.height);
		add(txtInputfield);
		txtInputfield.setColumns(1);
		

		setSize(size);
		
	}

	public String getInput() {
		return txtInputfield.getText();
	}
}
