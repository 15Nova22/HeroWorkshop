package com.avaruus.heroworkshop.panels.components.tabs.summary;

import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.avaruus.utils.AvaruusComboBox;
import com.avaruus.utils.AvaruusInputField;
import com.avaruus.utils.ISize;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JComboBox;

public class Basics extends JPanel implements ISize{

	private int width = 200;
	private int height = 125;
	
	/**
	 * Create the panel.
	 */
	public Basics() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Dimension sizePer = new Dimension(width, 25);
		
		add(Box.createHorizontalGlue());
		
		JLabel lblCharacterBasics = new JLabel("Character Basics");
		lblCharacterBasics.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCharacterBasics.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCharacterBasics.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterBasics.setSize(sizePer);
		add(lblCharacterBasics);
		
		
		
		AvaruusInputField inputName = new AvaruusInputField(sizePer, "Character Name");		
		add(inputName);
		
		AvaruusInputField inputPlayer = new AvaruusInputField(sizePer, "Player Name");
		add(inputPlayer);
		
		String[] genders = {"Male", "Female"};
		AvaruusComboBox cbGen = new AvaruusComboBox(sizePer, "Gender", genders);
		add(cbGen);
		
		String[] hands = {"Left", "Right"};
		AvaruusComboBox cbHand = new AvaruusComboBox(sizePer, "Handed", hands);
		add(cbHand);
		
			
		
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}
}
