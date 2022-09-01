package easterCalendar;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class EasterPanel extends JPanel {

	int x, y;

	public EasterPanel(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("c:\\Users\\Admin\\Desktop\\JavaProjects\\Easter\\resources\\Easter2.jpeg"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ошибка при загрузке фонового изображения", "Ошибка", 0, null);
		}

		g.drawImage(image, 0, 0, x, y, null);
	}
}
