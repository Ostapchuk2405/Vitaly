/**
 * 
 */
package part17CollectionsFramework;

import java.io.*;
import java.util.*;

/**
 * ������� ���� ������ ���������� �������, ��������� ������ ������
 * 
 * @author Shiltd
 *
 */
class Phonebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		Properties ht = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name, number;
		FileInputStream fin = null;
		boolean changed = false;

//		������� ������� ���� phonebook.dat
		try {
			fin = new FileInputStream("resources\\part17\\phonebook.dat");
		} catch (FileNotFoundException e) {
			System.out.println("���� ���������� ����� �� ������.");
		}

//		���� ���������� ����� ��� ���������� - ��������� ������������ ���������� ������.
		try {
			if (fin != null) {
				ht.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			System.out.println("������ ������ �����.");
		}

//		��������� ������������ ������� ����� ����� � ������ ���������
		do {
			System.out.println("������� ��� " + " ('�����' ��� ���������):");
			name = br.readLine();
			if (name.equals("�����"))
				continue;
			System.out.println("������� �����: ");
			number = br.readLine();
			ht.put(name, number);
			changed = true;
		} while (!name.equals("�����"));

//		���� ���������� ����� ���������� - ��������� �
		if (changed) {
			FileOutputStream fout = new FileOutputStream("resources\\part17\\phonebook.dat");
			ht.store(fout, "���������� �����");
			fout.close();
		}

//		������ ����� �� �����
		do {
			System.out.println("������� ��� ��� ������ ('�����' ��� ���������):");
			name = br.readLine();
			if (name.equals("�����"))
				continue;
			number = (String) ht.get(name);
			System.out.println(number);
		} while (!name.equals("�����"));
	}

}
