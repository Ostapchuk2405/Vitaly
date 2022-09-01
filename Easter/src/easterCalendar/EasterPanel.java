package easterCalendar;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

 @SuppressWarnings("serial")
class EasterPanel extends JPanel {

	 @Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Image image = null;
		try {
			image = ImageIO.read(new File("resources\\Easter2.jpeg"));
		} catch (IOException e) {
			System.out.println(e);
		}
		
		g.drawImage(image, 0, 0, null);
	}
}
