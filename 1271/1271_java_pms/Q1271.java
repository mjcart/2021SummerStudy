package q1271;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger(); // 총 금액 입력
		BigInteger m = sc.nextBigInteger(); // 생명체 수 입력
		
		BigInteger dividend = n.divide(m);	// 생명체 당 배당금
		BigInteger change = n.remainder(m);	// 나머지
		
		System.out.println(dividend);
		System.out.println(change);

	}

}
