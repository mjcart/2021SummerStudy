package q1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		Integer[] A = new Integer[n];
		Integer[] B = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st1.nextToken());
			B[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(B, Collections.reverseOrder());
		
		int s = 0; 
		for(int i = 0; i < n; i++) {
			s += A[i]*B[i];
		}
		System.out.println(s);


	}

}
