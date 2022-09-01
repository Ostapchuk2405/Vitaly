package certification;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {

		JFrame frame = new JImage();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class JImage extends JFrame {
	public JImage() {
		setTitle("Image");
		setSize(800, 600);
		Container contentPane = getContentPane();
		JImagePanel panel = new JImagePanel();
		contentPane.add(panel);
	}

}

@SuppressWarnings("serial")
class JImagePanel extends JPanel {

	int x = 800;
	int y = 600;

//	File folder = new File("c:\\Users\\Admin\\Desktop\\JavaProjects\\Easter\\resources\\Icons\\");
//	File[] files = folder.listFiles();
//	Random random = new Random();
//	int index = random.nextInt(files.length);

	@Override
	public void paint(Graphics g) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("c:\\\\Users\\\\Admin\\\\Desktop\\\\JavaProjects\\\\Easter\\\\resources\\\\Easter2.jpeg"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ошибка при загрузке фонового изображения", "Ошибка", 0, null);
		}
		g.drawImage(image, 0, 0, x, y, null);
	}
}