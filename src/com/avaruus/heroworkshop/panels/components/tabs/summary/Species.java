package com.avaruus.heroworkshop.panels.components.tabs.summary;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.avaruus.utils.ISize;

public class Species extends JPanel implements ISize{

	private int width = 100;
	private int height = 100;
		
	
	/**
	 * Create the panel.
	 */
	public Species() {
		setBackground(Color.black);
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}

}
