/**
 * 
 */
package part12EnumAutoboxAnnotation.enumeration;

/**
 * ������������������� ��������� �������� ������� �� ����� 9
 * @author Shiltd
 *
 */

import java.util.Random;

enum Answers {
	NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
	Random rand = new Random();

	Answers ask() {
		int prob = (int) (100 * rand.nextDouble());

		if (prob < 15)
			return Answers.MAYBE;
		else if (prob < 30)
			return Answers.NO;
		else if (prob < 60)
			return Answers.YES;
		else if (prob < 75)
			return Answers.LATER;
		else if (prob < 98)
			return Answers.SOON;
		else
			return Answers.NEVER;
	}
}

class AskMe {

	/**
	 * @param args
	 */

	static void answer(Answers result) {
		switch (result) {
		case NO:
			System.out.println("���"); // 15%
			break;
		case YES:
			System.out.println("��"); // 15%
			break;
		case MAYBE:
			System.out.println("��������"); // 30%
			break;
		case LATER:
			System.out.println("�������"); // 15%
			break;
		case SOON:
			System.out.println("������"); // 13%
			break;
		case NEVER:
			System.out.println("�������"); // 2%
			break;
		}
	}

	public static void main(String[] args) {

		Question q = new Question();

		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}

}
