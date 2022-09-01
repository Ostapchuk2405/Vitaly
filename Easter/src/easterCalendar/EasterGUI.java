
package easterCalendar;

import javax.swing.JFrame;

public class EasterGUI {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		EasterFrame frame = new EasterFrame();
		frame.setTitle("Пасха");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new Sound();
	}

}
