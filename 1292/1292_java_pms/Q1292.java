package q1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1292 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		
		int n = 0;

		while(sequence.size() < b) {
			n++;
			for(int i = 0; i < n; i++) {
				sequence.add(n);
				
			}
		}
		int sum = 0;

		for(int i = a; i <= b; i++) {
			sum += sequence.get(i - 1);
		}
		System.out.println(sum);

	}

}
