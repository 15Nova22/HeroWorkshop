package com.avaruus.heroworkshop.panels.components.tabs.summary;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.avaruus.heroworkshop.panels.components.tabs.summary.abilitites.AbilityRow;
import com.avaruus.utils.FileReader;
import com.avaruus.utils.ISize;

public class Abilities extends JPanel implements ISize{
	
	private List<AbilityRow> rows;
	
	/**
	 * Create the panel.
	 */
	public Abilities() {
		setBackground(Color.GREEN);
		
		setLayout(null);
		
		AbilityRow header = new AbilityRow();
		add(header);
		
		rows = new ArrayList<AbilityRow>();
		int y = header.GetSize().height;
		String[] abilities = FileReader.ReadStringLinesFromFile("/files/abilities.abs");
		if (abilities != null) {
			for (int i = 0; i < abilities.length; i++) {
				AbilityRow row = new AbilityRow(abilities[i]);
				rows.add(row);
				row.setLocation(0, y);
				add(row);
				y += row.GetSize().height;
			}			
		}
		
		setSize(GetSize());
	}

	@Override
	public Dimension GetSize() {
		Dimension dim = new Dimension();
		dim.width = rows.get(0).GetSize().width;
		dim.height = rows.get(0).GetSize().height * (rows.size() + 1);
		//System.out.println("Abs: " + dim);
		return dim;
	}

}
