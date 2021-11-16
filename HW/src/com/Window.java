package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Window implements ActionListener {

	public Window() {
		initComponents();
	}

	private JFrame viewForm;

	private void initComponents() {
		viewForm = new JFrame("Main Form");
		viewForm.setSize(800, 600);
		viewForm.setVisible(true);
		viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JButton button = new JButton("Click me!");
		button.setVisible(true);
		button.setLocation(350, 250);
		button.setSize(120, 20);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(viewForm, "Don't touch me!", "Warning", JOptionPane.WARNING_MESSAGE);
			}

		});
		viewForm.getContentPane().add(button);
		viewForm.getContentPane().add(new JLabel());
	}

	public void actionPerformed(ActionEvent action) {

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new Window();
			}
		});
	}

}
