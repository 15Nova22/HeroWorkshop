package com.avaruus.heroworkshop.panels.components.tabs.summary.abilitites;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.avaruus.utils.Fonts;
import com.avaruus.utils.ISize;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AbilityRow extends JPanel implements ISize{

	private static int sizeXFirst = 100;
	private static int sizeXOther = 75;
	private static int sizeY = 25;
	
	/**
	 * Create the panel as header.
	 */
	public AbilityRow() {	
		createLabels("Ability", "Score", "Modifier", "Adjustable", "Species", "Misc", new Color(100, 100, 100, 100), true);
		setSize(GetSize());
		repaint();
		revalidate();
	}

	/**
	 * Create the panel as Row
	 * 
	 * @param name The name of the row
	 */
	public AbilityRow(String name) {
		createLabels(name, "0", "0", "0", "0", "0", new Color(255, 255, 255, 0), false);
		setSize(GetSize());
		repaint();
		revalidate();
	}
	
	public static void SetSize(int sizeXFirst, int sizeXOthers, int sizeY) {
		AbilityRow.sizeXFirst = sizeXFirst;
		AbilityRow.sizeXOther = sizeXOthers;
		AbilityRow.sizeY = sizeY;
	}
	
	private void createLabels(String ability, String score, String modifier, String adjustable, String species, String misc, Color color, boolean centered) {
		setLayout(null);
		
		int x = 0;
		JLabel labelAbs = new JLabel(ability);		
		if (centered) labelAbs.setFont(Fonts.BASE_BOLD);
		labelAbs.setBackground(color);
		labelAbs.setBounds(x, 0, sizeXFirst, sizeY);
		if (centered) labelAbs.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelAbs);
		x += sizeXFirst;		
		
		JLabel labelScore = new JLabel(score);
		if (centered) labelScore.setFont(Fonts.BASE_BOLD);
		labelScore.setBackground(color);
		labelScore.setBounds(x, 0, sizeXOther, sizeY);
		if (centered) labelScore.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelScore);
		x += sizeXOther;
		
		JLabel labelMod = new JLabel(modifier);
		if (centered) labelMod.setFont(Fonts.BASE_BOLD);
		labelMod.setBackground(color);
		labelMod.setBounds(x, 0, sizeXOther, sizeY);
		if (centered) labelMod.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelMod);
		x += sizeXOther;
		
		JLabel labelAdjust = new JLabel(adjustable);
		if (centered) labelAdjust.setFont(Fonts.BASE_BOLD);
		labelAdjust.setBackground(color);
		labelAdjust.setBounds(x, 0, sizeXOther, sizeY);
		if (centered) labelAdjust.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelAdjust);
		x += sizeXOther;
		
		JLabel labelSpec = new JLabel(species);
		if (centered) labelSpec.setFont(Fonts.BASE_BOLD);
		labelSpec.setBackground(color);
		labelSpec.setBounds(x, 0, sizeXOther, sizeY);
		if (centered) labelSpec.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelSpec);
		x += sizeXOther;
		
		JLabel labelMisc = new JLabel(misc);
		if (centered) labelMisc.setFont(Fonts.BASE_BOLD);
		labelMisc.setBackground(color);
		labelMisc.setBounds(x, 0, sizeXOther, sizeY);
		if (centered) labelMisc.setHorizontalAlignment(SwingConstants.CENTER);
		add(labelMisc);
		x += sizeXOther;		
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.height = sizeY;
		dim.width = sizeXFirst + 5 * sizeXOther;
		return dim;
	}
	
	
}
