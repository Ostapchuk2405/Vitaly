import java.util.Scanner;

public class MathLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� ��� ������ ������: ");

		int x = sc.nextInt();
		int cycles = 0;
		int maxX = 0;

		while (x > 0) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			cycles++;
			if (x > maxX) {
				maxX = x;
			}
			if (x == 1) {
				break;
			}

		}

		System.out.println("���������� ������ = " + cycles);
		System.out.println("������������ ����� = " + maxX);

		sc.close();
	}

}