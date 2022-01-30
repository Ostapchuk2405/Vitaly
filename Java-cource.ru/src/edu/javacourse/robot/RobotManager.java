package edu.javacourse.robot;

import javax.swing.JFrame;

import edu.javacourse.robot.ui.RobotFrame;

public class RobotManager {

	public static void main(String[] args) {

		final int COUNT = 4;

		final int SIDE = 100;

		Robot robot = new Robot(200, 50);

		SimpleRobotListener srl = new SimpleRobotListener();
		robot.setListener(srl);

		for (int i = 0; i < COUNT; i++) {
			robot.forward(SIDE);
			robot.setCource(robot.getCource() + 360 / COUNT);
		}

		RobotFrame rf = new RobotFrame(robot);
		rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rf.setVisible(true);
	}

}
