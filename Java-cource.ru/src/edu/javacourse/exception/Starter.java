package edu.javacourse.exception;

public class Starter {

	public static void main(String[] args) {
		Generator generator = new Generator();

		try {
			String answer = generator.helloMessage(null);
			System.out.println("Answer 1: " + answer);
		} catch (SimpleException ex) {
			System.out.println("ErrorCode: " + ex.getErrorCode());
			System.out.println("ErrorMesage: " + ex.getMessage());
		} finally {
			System.out.println("This block is always called");
		}
		System.out.println();

		try {
			String answer = generator.helloMessage("Vitaliy");
			System.out.println("Answer 2: " + answer);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("This block is always called");
		}
	}

}
