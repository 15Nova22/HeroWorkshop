package com.avaruus.utils;

import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AvaruusComboBox extends JPanel {

	JComboBox<String> comboBox;
	
	/**
	 * Create the panel.
	 */
	public AvaruusComboBox(Dimension size, String name, String[] arguments) {
		setLayout(null);
		
		JLabel lblLabel = new JLabel(name);		
		lblLabel.setSize(size);
		lblLabel.setBounds(0, 0, size.width / 2, size.height);
		add(lblLabel);
		
		
		comboBox = new JComboBox<String>(arguments);
		comboBox.setSize(size);
		comboBox.setBounds(size.width /2, 0, size.width / 2, size.height);
		add(comboBox);		

		setSize(size);
	}

	public String getInput() {
		return (String) comboBox.getSelectedItem();	
	}
}
