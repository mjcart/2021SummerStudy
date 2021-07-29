package q1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1343 {
	static String output = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char[] input = st.toCharArray();
		
		int cnt = 0;
		char now;
		
		for(int i  = 0; i < input.length; i++) {
			now = input[i];
			if (now == 'X') {
				cnt++;
			}
			if (now == '.') {
				if(cnt % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(cnt);

				output = output + ".";
				
				cnt = 0;
			}
			if(i == input.length -1) {
				int n = cnt;
				
				if(n % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(n);
				cnt = 0;
			}

		}
		System.out.println(output);
	}
	static void process(int n) {

		int a = n / 4;
		int b = (n % 4) / 2;
		for(int j = 0; j < a; j++) {
			output = output + "AAAA";
		}
		for(int j = 0; j < b; j++) {
			output = output + "BB";
		}

	}

}
