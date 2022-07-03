package edu.javacourse.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServer {

	public static void main(String[] args) {

		int port = 1777;

		try {
			ServerSocket serverSocket = new ServerSocket(port);

			while (true) {
				System.out.println("Waiting for a connection on: " + port);
				Socket fromClientSocket = serverSocket.accept();
				new SocketThread(fromClientSocket).start();
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

}

class SocketThread extends Thread {

	private Socket fromClientSocket;

	public SocketThread(Socket fromClientSocket) {
		this.fromClientSocket = fromClientSocket;
	}

	@Override
	public void run() {
		try (Socket localSocket = fromClientSocket;
				PrintWriter pw = new PrintWriter(localSocket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(localSocket.getInputStream()))) {

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println("The message: " + str);
				if (str.equals("bye")) {
					pw.println("bye");
					break;
				} else {
					str = "Servers returns: " + str;
					pw.println(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

}