package q1439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int zero = 0;
		int one = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)== '0') {
				if(i == s.length()-1 || s.charAt(i+1) == '1') {
					zero++;
				}
			}
			if(s.charAt(i)== '1') {
				if(i == s.length()-1 || s.charAt(i+1) == '0') {
					one++;
				}
			}
		}
		if(zero + one == 1) {
			System.out.println(0);
		}else {
			System.out.println(Math.min(zero, one));
		}

}
}
