package com.avaruus.utils;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuButton extends JLabel implements ISize {
	
	private ImageIcon imageNormal;
	private ImageIcon imageHigh;
	private ImageIcon imageDisabled;
	private ImageIcon imagePressed;
	
	private int width, height;
	
	private boolean enabled;
	
	public MenuButton(String baseImagePath, int width, int height, IButtonExecutable exec, String text) {
		this(baseImagePath, width, height, true, exec, text);
	}
	
	/**
	 * Create a new Button with a custom set of images.
	 * 
	 * @param baseImagePath The path to the folder containing the buttons sprites
	 * @param width			The width of the button
	 * @param height		The height of the button
	 * @param enabled		Flag if the button is enabled
	 * @param exec			The Function that should be executed on button press
	 * @param text			The text of the button
	 */
	public MenuButton(String baseImagePath, int width, int height, boolean enabled, IButtonExecutable exec, String text) {
		BufferedImage imgNormal = ImageLoader.loadImage(baseImagePath + "/base.png");	
		BufferedImage imgHigh = ImageLoader.loadImage(baseImagePath + "/high.png");
		BufferedImage imgDisabled = ImageLoader.loadImage(baseImagePath + "/disabled.png");
		BufferedImage imgPressed = ImageLoader.loadImage(baseImagePath + "/pressed.png");
		imageNormal = new ImageIcon(ImageResizer.resizeInBorder(imgNormal, width, height));		
		imageHigh = new ImageIcon(ImageResizer.resizeInBorder(imgHigh, width, height));	
		imageDisabled = new ImageIcon(ImageResizer.resizeInBorder(imgDisabled, width, height));	
		imagePressed = new ImageIcon(ImageResizer.resizeInBorder(imgPressed, width, height));	
		setIcon(imageNormal);
		this.enabled = enabled;
		if (!enabled) setIcon(imageDisabled);
		setText(text);
		setHorizontalTextPosition(SwingConstants.CENTER);
		
		this.width = width;
		this.height = height;
		
		MenuButton that = this;
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if (enabled) exec.Execute();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if (enabled) that.setIcon(imagePressed);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				if (enabled) that.setIcon(imageNormal);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				if (enabled) that.setIcon(imageHigh);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});		
		
		setSize(GetSize());
	}
	
	public void Enable() {
		enabled = true;
		setIcon(imageNormal);
	}
	
	public void Disable() {
		enabled = false;
		setIcon(imageDisabled);
	}

	@Override
	public Dimension GetSize() {
		return new Dimension(width, height);
	}
}
