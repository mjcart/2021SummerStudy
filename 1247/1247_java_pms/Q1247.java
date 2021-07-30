package q1247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		BigInteger zero = new BigInteger("0");
		for(int i = 0; i < 3; i++) {
			n = Integer.parseInt(br.readLine());
			BigInteger s = zero;
			for(int j = 0; j < n; j++) {
				BigInteger now = new BigInteger(br.readLine());
				s = s.add(now);
			}
			if(s.compareTo(zero) == 0) {	// 결과값이 0이면 
				System.out.println(0);
			}else if(s.compareTo(zero) == 1) {	// 결과값이 양수이면
				System.out.println("+");
			}else {							// 결과값이 음수이면
				System.out.println("-");
			}
		}

	}

}
