package edu.javacourse.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket("java-course.ru", 80);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();

		String str = "GET /network.txt HTTP/1.1\r\n" + "Host:java-course.ru\r\n\r\n";

		byte buf[] = str.getBytes();
		out.write(buf);

		int size;
		byte[] buf_out = new byte[1024];
		while ((size = in.read(buf_out)) != -1) {
			System.out.println(new String(buf_out, 0, size));
		}
		s.close();
	}

}
