package com.avaruus.heroworkshop;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import com.avaruus.heroworkshop.panels.MainPanel;
import com.avaruus.utils.ISize;

public class ApplicationFrame extends JFrame implements ISize {

	private MainPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationFrame frame = new ApplicationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApplicationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hero Workshop");
		contentPane = new MainPanel(this);
		setContentPane(contentPane);
		Dimension d = contentPane.GetSize();
		setBounds(100, 100, d.width + 20, d.height + 20);
	}

	@Override
	public Dimension GetSize() {
		//System.out.println(getSize());
		return getSize();
	}

}
