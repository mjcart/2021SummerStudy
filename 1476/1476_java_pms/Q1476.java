package q1476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int year = 1;
		
		int E = 1, S = 1, M = 1;
		
		while(true) {
			if(E == e && S == s && M == m) {
				break;
			}
			if(E == 15) {
				E = 1;
			}else {
				E++;
			}
			if(S == 28) {
				S = 1;
			}else {
				S++;
			}
			if(M == 19) {
				M = 1;
			}else {
				M++;
			}
			year++;
			
		}
		System.out.println(year);

	}

}
