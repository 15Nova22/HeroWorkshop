package com.avaruus.heroworkshop.panels.components.tabs.summary;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.avaruus.utils.ISize;
import java.awt.Component;

public class MiddlePanel extends JPanel implements ISize {

	private Abilities abilities = new Abilities();
	private Statistics statistics = new Statistics();
	
	/**
	 * Create the panel.
	 */
	public MiddlePanel() {
		setLayout(null);
		add(abilities);
		statistics.setLocation(0, GetSize().height - statistics.GetSize().height);
		add(statistics);
		
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.height = abilities.GetSize().height + statistics.GetSize().height;
		dim.width = abilities.GetSize().width > statistics.GetSize().width ? abilities.GetSize().width : statistics.GetSize().width;
		//System.out.println("Mid: " + dim);
		return dim;
	}

}
