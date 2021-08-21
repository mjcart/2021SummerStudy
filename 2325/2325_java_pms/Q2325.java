package q2325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2325 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i  < t; i++) {
			m++;
			if(m > 59) {
				h++;
				if(h > 23) {
					h = 0;
				}
				m = 0;
				
			}
		}
		System.out.println(h + " " + m);

	}

}
