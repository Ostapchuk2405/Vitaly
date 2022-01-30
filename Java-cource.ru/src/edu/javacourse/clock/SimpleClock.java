package edu.javacourse.clock;

import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SimpleClock extends JFrame {

	private JLabel clockLabel = new JLabel();

	public SimpleClock() {
		setTitle("ClockThread");

		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

		Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);

		clockLabel.setFont(f);
		getContentPane().add(clockLabel);
		setBounds(400,300,300,100);

		Thread thr = new MyThread(this);
		thr.start();
	}

	public void setTime() {
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		clockLabel.setText(df.format(Calendar.getInstance().getTime()));
	}

	public static void main(String[] args) {
		SimpleClock cl = new SimpleClock();
		cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl.setVisible(true);
	}

}
