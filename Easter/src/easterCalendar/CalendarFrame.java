package easterCalendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class CalendarFrame extends JFrame {

	JPanel calendar;
	Calendar dateEaster;
	int MONTH_LENGTH[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int currentEaster;
	int year = EasterFrame.year;

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new EasterFrame();

		}
	};

	public CalendarFrame() {

		dateEaster = Calendar.getInstance();
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int d = (19 * a + 15) % 30;
		int e = (2 * b + 4 * c + 6 * d + 6) % 7;
		int f = d + e;

		if (f <= 9)
			dateEaster.set(year, Calendar.MARCH, 22 + f + 13);
		else
			dateEaster.set(year, Calendar.APRIL, f - 9 + 13);
		currentEaster = dateEaster.get(Calendar.DAY_OF_MONTH);
		DateFormat df = new SimpleDateFormat("dd MMMM yyyy");

		setBounds(200, 200, 800, 600);
		setResizable(true);

		setContentPane(new CalendarPanel());
		Container contentPane = getContentPane();
		
		JPanel monthPanel = new JPanel();
		monthPanel.setBackground(new Color(0, 0, 0, 0));
		monthPanel.setOpaque(false);
		
		JButton menu = new JButton("Назад");
		menu.setBackground(new Color(0, 0, 0, 0));
		menu.addActionListener(listener);
		monthPanel.add(menu);

		JLabel dater = new JLabel();
		dater.setText(df.format(dateEaster.getTime()));
		dater.setFont(new Font("Arial", Font.BOLD, 30));
		dater.setForeground(Color.RED);
		dater.setBackground(new Color(0, 0, 0, 0));
		monthPanel.add(dater);
		contentPane.add(monthPanel, BorderLayout.NORTH);

		calendar = new JPanel();
		calendar.setOpaque(false);

		addButton("Пн", "days");
		addButton("Вт", "days");
		addButton("Ср", "days");
		addButton("Чт", "days");
		addButton("Пт", "days");
		addButton("Сб", "days");
		addButton("Вс", "days");

		Calendar easter = dateEaster;
		easter.set(Calendar.DAY_OF_MONTH, 1);

		int blankButtons = 0;
		switch (easter.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			blankButtons = 0;
			break;
		case Calendar.TUESDAY:
			blankButtons = 1;
			break;
		case Calendar.WEDNESDAY:
			blankButtons = 2;
			break;
		case Calendar.THURSDAY:
			blankButtons = 3;
			break;
		case Calendar.FRIDAY:
			blankButtons = 4;
			break;
		case Calendar.SATURDAY:
			blankButtons = 5;
			break;
		case Calendar.SUNDAY:
			blankButtons = 6;
			break;
		}

		for (int i = 0; i <= blankButtons - 1; i++) {
			addButton(" ", "blank");
		}

		for (int days = 1; days <= MONTH_LENGTH[dateEaster.get(Calendar.MONTH)]; days++) {

			if (currentEaster == days)
				addButton(days + "", "east");
			else
				addButton(days + "", "");
		}

		calendar.setLayout(new GridLayout(0, 7, 10, 10));
		contentPane.add(calendar, BorderLayout.CENTER);
	}

	private void addButton(String label, String how) {
		JButton button = new JButton(label);
		switch (how) {
		case "blank":
			button.setBackground(new Color(0, 0, 0, 0));
			button.setEnabled(false);
			break;
		case "east":
			button.setBackground(Color.PINK);
			button.setFont(new Font("Ariel", Font.BOLD, 36));
			button.setForeground(Color.GREEN);
			button.setEnabled(false);
			break;
		case "days":
			button.setBackground(Color.YELLOW);
			button.setFont(new Font("Ariel", Font.BOLD, 30));
			button.setForeground(Color.YELLOW);
			button.setEnabled(false);
			break;
		case "":
			button.setForeground(Color.BLACK);
			button.setFont(new Font("Ariel", Font.BOLD, 30));
			button.setBackground(new Color(0, 0, 0, 0));
			button.setEnabled(false);
			break;
		}

		calendar.add(button);
	}

}
