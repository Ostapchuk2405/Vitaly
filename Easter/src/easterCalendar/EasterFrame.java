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
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class EasterFrame extends JFrame {

	JTextField yearField = null;
	static int year;

	public EasterFrame() {

		setBounds(200, 200, 750, 530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setContentPane(new EasterPanel());
		Container contentPane = getContentPane();
		JPanel panel = new JPanel();

		JLabel label = new JLabel("Введи нужный год:");
		label.setFont(new Font("Arial", Font.ITALIC, 18));
		label.setForeground(Color.RED);
		panel.add(label);

		
		yearField = new JTextField(4);
		panel.add(yearField);

		


		JButton okButton = new JButton("Высчитать");
		panel.add(okButton);
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
				}
				
				
				

			}
		};

		okButton.addActionListener(listener);


	}
}
