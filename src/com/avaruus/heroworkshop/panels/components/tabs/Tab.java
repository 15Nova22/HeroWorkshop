package com.avaruus.heroworkshop.panels.components.tabs;

import java.awt.Dimension;

import javax.swing.JPanel;

import com.avaruus.utils.ISize;

public abstract class Tab extends JPanel implements ISize{
	
	@Override
	public abstract Dimension GetSize();

}
