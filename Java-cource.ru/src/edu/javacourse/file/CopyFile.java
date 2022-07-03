package edu.javacourse.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		copyFile("d:\\Downloads\\contact\\target\\classes\\edu\\javacourse\\contact\\dao\\ContactSimpleDAO.class",
				"d:\\copyContactSimpleDAO.class");
		long time2 = System.currentTimeMillis();

		System.out.println("Operation time: " + (time2 - time1) + " milli seconds");
	}

	private static void copyFile(String source, String target) {
		try (FileInputStream fis = new FileInputStream(source); 
			FileOutputStream fos = new FileOutputStream(target)) {
			
			byte[] buffer = new byte[8192];
			int size = 0;
			
			while ((size = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, size);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

