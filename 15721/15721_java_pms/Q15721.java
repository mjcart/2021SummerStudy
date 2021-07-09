package q210709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15721 {
	static int a, t, chant;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		t = Integer.parseInt(br.readLine());
		chant = Integer.parseInt(br.readLine());
		int out = result();
		System.out.println(out);
	}
	
	static int result() {
		int bbun = 0, degi = 0, n = 2;
		while(true) {
			for (int i = 0; i < 4; i++) {
				if (i % 2 == 0) {
					bbun++;
				}else {
					degi++;
				}
				if (bbun == t && chant == 0) {
					return (bbun + degi - 1) % a;
				}
				if (degi == t && chant == 1) {
					return (bbun + degi - 1) % a;
				}
			}
			for (int i = 0; i < n; i++) {
				bbun++;
				if (bbun == t && chant == 0) {
					return (bbun + degi -1) % a;
				}
			}
			for (int i = 0; i < n; i++) {
				degi++;
				if (degi == t && chant == 1) {
					return (bbun + degi - 1) % a;
				}
			}
			n++;
		}
	}

}
