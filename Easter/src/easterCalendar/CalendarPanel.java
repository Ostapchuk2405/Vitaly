package easterCalendar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CalendarPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9151817838764016597L;

	public CalendarPanel() {
		setBounds(200, 200, 800, 600);
		setBackground(new Color(0, 0, 0, 0));
		setOpaque(false);
	}

	File folder = new File("c:\\Users\\Admin\\Desktop\\JavaProjects\\Easter\\resources\\Icons\\");
	File[] files = folder.listFiles();
	Random random = new Random();
	int index = random.nextInt(files.length);

	@Override
	public void paintComponent(Graphics g) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(files[index]);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ошибка при загрузке фонового изображения", "Ошибка", 0, null);
		}
		super.paintComponent(g);
		g.drawImage(image, 0, 0, 800, 600, this);
	}
}
