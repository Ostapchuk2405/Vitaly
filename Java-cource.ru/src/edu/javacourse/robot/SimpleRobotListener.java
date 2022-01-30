package edu.javacourse.robot;

public class SimpleRobotListener implements RobotListener {

	@Override
	public void startMove(double x, double y) {
		System.out.println("Robor begin move, coordinates: " + x + ", " + y);
	}

	@Override
	public void endMove(double x, double y) {
		System.out.println("Robot end move, coordinates: " + x + ", " + y);
	}

}
