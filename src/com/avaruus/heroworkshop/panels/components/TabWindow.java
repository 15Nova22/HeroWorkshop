package com.avaruus.heroworkshop.panels.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.naming.NameNotFoundException;
import javax.swing.JPanel;

import com.avaruus.heroworkshop.ApplicationFrame;
import com.avaruus.heroworkshop.panels.components.tabs.SummaryTab;
import com.avaruus.heroworkshop.panels.components.tabs.Tab;
import com.avaruus.utils.ISize;
import javax.swing.BoxLayout;

public class TabWindow extends JPanel implements ISize{
	
	private SummaryTab sumTab;
	
	private Tab activeTab;
	private TabBar bar;
	
	private ApplicationFrame parent;
	
	/**
	 * Create the panel.
	 */
	public TabWindow(ApplicationFrame parent) {
		setBackground(Color.orange);
		
		sumTab = new SummaryTab();
		setLayout(null);
		
		bar = new TabBar(this);		
		add(bar);
		
		
		activeTab = sumTab;
		add(activeTab);		
		
		setSize(GetSize());
		bar.setLocation(0, 0);
		positionTab();
		
		this.parent = parent;
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.height = bar.GetSize().height + activeTab.GetSize().height;
		dim.width = bar.GetSize().width > activeTab.GetSize().width ? bar.GetSize().width : activeTab.GetSize().width;
		//System.out.println(dim);
		return dim;
	}

	private void positionTab() {
		activeTab.setLocation(0, GetSize().height - activeTab.GetSize().height);
	}
	
	public void SetTab(String name) {
		remove(activeTab);
		try {
			switch (name) {
				case "Summary":				
					activeTab = sumTab;
					break;
				default:				
					throw new NameNotFoundException("No Tab with the name " + name + " was found");
			}
		} catch (NameNotFoundException e) {				
			e.printStackTrace();
		} finally {
			add(activeTab);
		}	
	}	
}
