package easterCalendar;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class Sound implements AutoCloseable {

	AudioInputStream stream = null;
	static Clip clip = null;
	static FloatControl volumeControl = null;

	public Sound() {
		try {
		stream = AudioSystem.getAudioInputStream(
				new File("c:\\Users\\Admin\\Desktop\\JavaProjects\\Easter\\resources\\Easter.wav"));
		clip = AudioSystem.getClip();
		clip.open(stream);
		volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		volumeControl.setValue(6);
		clip.start();
		}catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
			JOptionPane.showMessageDialog(null, "Что-то не так со звуком");
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

}
