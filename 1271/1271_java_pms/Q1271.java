package q1271;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger(); // �� �ݾ� �Է�
		BigInteger m = sc.nextBigInteger(); // ����ü �� �Է�
		
		BigInteger dividend = n.divide(m);	// ����ü �� ����
		BigInteger change = n.remainder(m);	// ������
		
		System.out.println(dividend);
		System.out.println(change);

	}

}
