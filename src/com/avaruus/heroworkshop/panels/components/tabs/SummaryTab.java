package com.avaruus.heroworkshop.panels.components.tabs;

import java.awt.Color;
import java.awt.Dimension;

import com.avaruus.heroworkshop.panels.components.tabs.summary.Abilities;
import com.avaruus.heroworkshop.panels.components.tabs.summary.Basics;
import com.avaruus.heroworkshop.panels.components.tabs.summary.MiddlePanel;
import com.avaruus.heroworkshop.panels.components.tabs.summary.Species;
import com.avaruus.heroworkshop.panels.components.tabs.summary.Statistics;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SummaryTab extends Tab {
	
	Basics basics = new Basics();
	MiddlePanel middle = new MiddlePanel();
	Species species = new Species();	
	
	/**
	 * Create the panel.
	 */
	public SummaryTab() {
		//setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setLayout(null);
		
		/*JPanel buffer = new JPanel();
		buffer.setMinimumSize(new Dimension(0,0));
		buffer.setBackground(Color.BLUE);
		
		JPanel buffer2 = new JPanel();
		buffer2.setMinimumSize(new Dimension(0,0));
		buffer2.setBackground(Color.BLUE);*/
		
		
		basics.setLocation(0, 0);
		species.setLocation(GetSize().width - species.GetSize().width, 0);
		
		int centeredBetween = basics.GetSize().width + ((GetSize().width - basics.GetSize().width - species.GetSize().width - middle.GetSize().width) / 2);
		middle.setLocation(centeredBetween, 0);
		
		add(basics);		
		add(middle);
		add(species);
		
		setBackground(Color.pink);		
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.width = basics.GetSize().width + middle.GetSize().width + species.GetSize().width;
		dim.height = basics.GetSize().height;
		//System.out.println(dim.height);
		if (middle.GetSize().height > dim.height) dim.height = middle.GetSize().height;
		//System.out.println(dim.height);
		if (species.GetSize().height > dim.height) dim.height = species.GetSize().height;
		//System.out.println(dim.height);
		//System.out.println(dim);
		return dim;
	}
}
