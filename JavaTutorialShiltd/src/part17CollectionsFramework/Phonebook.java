/**
 * 
 */
package part17CollectionsFramework;

import java.io.*;
import java.util.*;

/**
 * Простая база данных телефонных номеров, используя списки свойст
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

//		попытка открыть файл phonebook.dat
		try {
			fin = new FileInputStream("resources\\part17\\phonebook.dat");
		} catch (FileNotFoundException e) {
			System.out.println("Файл телефонной книги не найден.");
		}

//		Если телефонная книга уже существует - загрузить существующие телефонные номера.
		try {
			if (fin != null) {
				ht.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			System.out.println("Ошибка чтения файла.");
		}

//		разрешить пользователю вносить новые имена и номера телефонов
		do {
			System.out.println("Введите имя " + " ('выход' для остановки):");
			name = br.readLine();
			if (name.equals("выход"))
				continue;
			System.out.println("Введите номер: ");
			number = br.readLine();
			ht.put(name, number);
			changed = true;
		} while (!name.equals("выход"));

//		если телефонная книга изменилась - сохранить её
		if (changed) {
			FileOutputStream fout = new FileOutputStream("resources\\part17\\phonebook.dat");
			ht.store(fout, "Телефонная книга");
			fout.close();
		}

//		искать номер по имени
		do {
			System.out.println("Введите имя для поиска ('выход' для остановки):");
			name = br.readLine();
			if (name.equals("выход"))
				continue;
			number = (String) ht.get(name);
			System.out.println(number);
		} while (!name.equals("выход"));
	}

}
