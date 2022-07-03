package com;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	ArrayList<String> songs = new ArrayList<String>();

	private void add(String song) {
		songs.add(song);
	}

	private void show() {
		System.out.println("***** Play List *****");
		for (int i = 0; i < songs.size(); i++) {
			System.out.println(songs.get(i));
		}
	}

	private void play() {
		System.out.println("***** Play *****");
		System.out.println("Playing " + songs.get(0));

	}

	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();

		Scanner sc = new Scanner(System.in);
		System.out.println("Name of song: ");

		while (true) {
			String song = sc.nextLine();
			if (song.equals("stop")) {
				break;
			}
			mp.add(song);
		}
		mp.show();
		mp.play();
		
		sc.close();
	}
}
