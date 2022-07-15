/**
 * 
 */
package part18JavaUtilAndOtherServicesClasses;

import java.util.BitSet;

/**
 * ������������ ���������� BitSet
 * 
 * @author Schiltd
 *
 */
class BitSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

//		��������� ��������� ����
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 5) != 0)
				bits2.set(i);
		}

		System.out.println("��������� ������ � bits1: ");
		System.out.println(bits1);
		System.out.println("\n��������� ������ � bits2: ");
		System.out.println(bits2);

//		���������� ��� ��� ������
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

//		���������� ���������� ��� ��� ������
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);
	}

}
