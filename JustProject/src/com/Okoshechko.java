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

		JFrame frame = new JFrame("FrameDemo"); // ������ ������� ���� ����������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����� ������� ���������� ����� �������� ����
		JButton button1 = new JButton("Button 1"); // ������ ������
		frame.add(button1); // ��������� ������ �� ����
		frame.pack(); // ������������� ����������� ������ ���� ��� ����������
		frame.setVisible(true); // ���������� ����

		Object rowData[][] = { { "1 1", "1 2", "1 3" }, { "2 1", "2 2", "2 3" } };
		Object columnNames[] = { "������� 1", "������� 2", "������� 3" };
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

	public void actionPerformed(ActionEvent e) { // �������, � ������� �������������� ������� ���� ������
		String command = e.getActionCommand();
		if (command.equals("add")) {
			dispose();
			System.exit(0);
		}
	}

	public JPanel createMainPanel() {
		JButton addBtn = new JButton("�������� ���������");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this); // ��������� ������, ����������� ��������� ActionListener,
		// � � ������� �������� ���������� ������� actionPerformed
		return btn;
	}

}
