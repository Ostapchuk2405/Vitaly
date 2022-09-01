package easterCalendar;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SettingsFrame extends JFrame {

	private static final long serialVersionUID = 503665532841818509L;

	JSlider volume = null;

	public SettingsFrame() {
		setTitle("Настройка");
		setBounds(400, 300, 250, 150);
		setResizable(false);
		setVisible(true);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel panel = new JPanel();

		JCheckBox sound = new JCheckBox("Звук");
		sound.setSelected(true);
		sound.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (sound.isSelected()) {
					if (!Sound.clip.isRunning()) {
						Sound.clip.start();
						volume.setEnabled(true);
					}
				} else {
					if (Sound.clip.isRunning()) {
						Sound.clip.stop();
						volume.setEnabled(false);
					}
				}
			}
		});
		panel.add(sound);

		volume = new JSlider((int) Sound.volumeControl.getMinimum(), (int) Sound.volumeControl.getMaximum(),
				(int) Sound.volumeControl.getMaximum());
		volume.setMajorTickSpacing(21);
		volume.setMinorTickSpacing(4);
		volume.setPaintTicks(true);
		volume.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int value = ((JSlider) e.getSource()).getValue();
				Sound.volumeControl.setValue(value);
			}
		});
		panel.add(volume);

		contentPane.add(panel, BorderLayout.CENTER);
	}
}
