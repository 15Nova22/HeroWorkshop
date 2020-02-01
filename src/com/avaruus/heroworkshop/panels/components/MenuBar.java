package com.avaruus.heroworkshop.panels.components;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.avaruus.utils.IButtonExecutable;
import com.avaruus.utils.ISize;
import com.avaruus.utils.MenuButton;
import javax.swing.BoxLayout;

public class MenuBar extends JPanel implements ISize {

	private int width = 500;
	private int height = 25;
	
	private List<MenuButton> buttons = new ArrayList<MenuButton>();
	
	/**
	 * Create the panel.
	 */
	public MenuBar() {
		setBackground(Color.LIGHT_GRAY);
		MenuButton file = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				
			}
		}, "File");
		buttons.add(file);
		
		MenuButton edit = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				
			}
		}, "Edit");
		buttons.add(edit);
		
		MenuButton sources = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				
			}
		}, "Sources");
		buttons.add(sources);		
		
		MenuButton tools = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				
			}
		}, "Tools");
		buttons.add(tools);
		
		MenuButton help = new MenuButton("/images/button", 100, 25, new IButtonExecutable() {			
			@Override
			public void Execute() {
				
			}
		}, "Help");
		buttons.add(help);
		
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
		
		setSize(GetSize());
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}
	
}
