package easterCalendar;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class EasterFrame extends JFrame {

	JTextField yearField = null;
	static int year;

	public EasterFrame() {

		setBounds(200, 200, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		setContentPane(new EasterPanel(800, 600));
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		panel.setOpaque(false);

		JLabel label = new JLabel("Введи нужный год:");
		label.setFont(new Font("Arial", Font.ITALIC, 18));
		label.setForeground(Color.RED);
		panel.add(label);

		yearField = new JTextField(4);
		panel.add(yearField);

		JButton okButton = new JButton("Высчитать");
		panel.add(okButton);
		
		JButton settings = new JButton("Настройки");
		settings.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 new SettingsFrame();
				
			}
		});
		panel.add(settings);
		contentPane.add(panel, BorderLayout.NORTH);
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				try {
					year = Integer.parseInt(yearField.getText().trim());
					dispose();
					CalendarFrame calendar = new CalendarFrame();
					calendar.setTitle("Календарь");
					calendar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					calendar.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Введи правильно год");
				}

			}
		};

		okButton.addActionListener(listener);


	}
}
