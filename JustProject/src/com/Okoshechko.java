package com;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

class Okoshechko extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		JFrame frame = new JFrame("FrameDemo"); // создаём главное окно приложения
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // чтобы процесс завершался после закрытия окна
		JButton button1 = new JButton("Button 1"); // создаём кнопку
		frame.add(button1); // добавляем кнопку на окно
		frame.pack(); // автоматически настраиваем размер окна под содержимое
		frame.setVisible(true); // отображаем окно

		Object rowData[][] = { { "1 1", "1 2", "1 3" }, { "2 1", "2 2", "2 3" } };
		Object columnNames[] = { "Колонка 1", "Колонка 2", "Колонка 3" };
		JTable table = new JTable(rowData, columnNames);
		frame.add(table);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		Component btn = null;
		mainPanel.add(btn);
		mainPanel.add(table);
		frame.add(mainPanel);
	}

	private JPanel btn;

	public void actionPerformed(ActionEvent e) { // функция, в которой обрабатываются события всех кнопок
		String command = e.getActionCommand();
		if (command.equals("add")) {
			dispose();
			System.exit(0);
		}
	}

	public JPanel createMainPanel() {
		JButton addBtn = new JButton("Добавить будильник");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this); // указываем объект, реализующий интерфейс ActionListener,
		// и в котором определён обработчик событий actionPerformed
		return btn;
	}

}
