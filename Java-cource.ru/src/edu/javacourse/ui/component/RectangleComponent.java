package edu.javacourse.ui.component;

import java.awt.Graphics;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent {

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.clearRect(5, 5, getWidth() - 10, getHeight() - 10);
	}

}
