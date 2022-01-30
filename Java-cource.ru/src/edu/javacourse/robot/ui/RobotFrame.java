package edu.javacourse.robot.ui;

import javax.swing.JFrame;

import edu.javacourse.robot.Robot;

public class RobotFrame extends JFrame {

	public RobotFrame(Robot robot) {

		setTitle("Robot Frame");

		add(new RobotPathComponent(robot));

		setBounds(100, 100, 500, 500);
	}

}
