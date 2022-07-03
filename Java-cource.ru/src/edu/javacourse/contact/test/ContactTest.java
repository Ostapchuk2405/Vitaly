package edu.javacourse.contact.test;

import edu.javacourse.contact.config.GlobalConfig;
import edu.javacourse.contact.gui.ContactFrame;
import edu.javacourse.contact.gui.GuiResource;

public class ContactTest {

	public static void main(String[] args) {

		try {
			GlobalConfig.initGlobalConfig();
			GuiResource.initComponentResources();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			return;
		}

		ContactFrame cf = new ContactFrame();
		cf.setVisible(true);

	}

}
