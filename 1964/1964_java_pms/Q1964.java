package q1964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1964 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long dot = 5;
		long prev = dot;
		
		for(int i = 2; i <= n; i++) {
			dot = prev + (i * 5) + (1 - i * 2);
			prev = dot;
		}
		
		System.out.println(dot%45678);

	}

}
