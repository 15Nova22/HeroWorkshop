package com.avaruus.heroworkshop.panels.components;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.avaruus.utils.IButtonExecutable;
import com.avaruus.utils.ISize;
import com.avaruus.utils.MenuButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class TabBar extends JPanel implements ISize {

	private int width = 700;
	private int height = 25;
	
	private List<MenuButton> buttons = new ArrayList<MenuButton>();
	
	/**
	 * Create the panel.
	 */
	public TabBar(TabWindow window) {
		setLayout(null);
		
		MenuButton summary = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Summary");
			}
		}, "Summary");
		buttons.add(summary);
		
		MenuButton description = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Description");
			}
		}, "Description");
		buttons.add(description);
		
		MenuButton species = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Species");
			}
		}, "Species");
		buttons.add(species);
		
		MenuButton clazz = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Class");
			}
		}, "Class");
		buttons.add(clazz);
		
		MenuButton skills = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Skills");
			}
		}, "Skills");
		buttons.add(skills);
		
		MenuButton feats = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Feats");
			}
		}, "Feats");
		buttons.add(feats);
		
		MenuButton equip = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				window.SetTab("Equipment");
			}
		}, "Equipment");
		buttons.add(equip);	
		
		int x = 0;
		for (int i = 0; i < buttons.size(); i++) {
			
			buttons.get(i).setLocation(x, 0);
			x += buttons.get(i).GetSize().width;
			add(buttons.get(i));
		}
		
		add(new JLabel("Test"));
		

		setSize(GetSize());
		repaint();
		revalidate();
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}

}
