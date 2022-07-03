/**
 * 
 */
package part13InOutAppletOther.applets;

import java.awt.*;
import java.applet.*;

/*
  <applet code = "SimpleApplet" width=200 height=60>
  </applet>
 */

/**
 * Пример Апплета
 * 
 * @author Shiltd
 *
 */
public class SimpleApplet extends Applet {

	public void paint(Graphics g) {
		g.drawString("A Simple Applet", 20, 20);
	}
}
