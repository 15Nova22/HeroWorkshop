package com.avaruus.heroworkshop.panels;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.avaruus.heroworkshop.ApplicationFrame;
import com.avaruus.heroworkshop.panels.components.MenuBar;
import com.avaruus.heroworkshop.panels.components.TabWindow;
import com.avaruus.utils.ISize;
import java.awt.Color;

public class MainPanel extends JPanel  implements ISize{

	private MenuBar bar;
	private TabWindow window;
	
	private ApplicationFrame parent;
	/**
	 * Create the panel.
	 */
	public MainPanel(ApplicationFrame parent) {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		bar = new MenuBar();
		add(bar);
		window = new TabWindow(parent);
		add(window);
		this.parent = parent;
		setSize(parent.GetSize());
		positionTabWindow();
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.height = bar.GetSize().height + window.GetSize().height;
		dim.width = bar.GetSize().width > window.GetSize().width ? bar.GetSize().width : window.GetSize().width;
		return dim;
	}
	
	@Override
	protected void paintComponent(Graphics window) {
		super.paintComponent(window);
		setSize(parent.GetSize());
		positionTabWindow();
	}
	
	private void positionTabWindow() {
		window.setLocation(0, parent.GetSize().height - window.GetSize().height);
	}
}
