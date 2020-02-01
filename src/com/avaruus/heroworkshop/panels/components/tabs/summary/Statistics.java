package com.avaruus.heroworkshop.panels.components.tabs.summary;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import com.avaruus.utils.ISize;

public class Statistics extends JPanel implements ISize{

	private int width = 100;
	private int height = 200;
	
	/**
	 * Create the panel.
	 */
	public Statistics() {
		setBackground(Color.RED);
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}

}
