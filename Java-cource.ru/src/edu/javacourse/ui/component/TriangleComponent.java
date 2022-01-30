package edu.javacourse.ui.component;

import java.awt.Graphics;

import javax.swing.JComponent;

public class TriangleComponent extends JComponent {

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawLine(5, getHeight() - 10, getWidth() / 2 - 5, 5);
		g.drawLine(getWidth() / 2 - 5, 5, getWidth() - 10, getHeight() - 10);
		g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
	}

}
