package q1297;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1297 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		int c = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		double h = Math.pow(c, 2) / (Math.pow(a, 2) + Math.pow(b, 2)) * Math.pow(a, 2);
		double w = Math.pow(c, 2) / (Math.pow(a, 2) + Math.pow(b, 2)) * Math.pow(b, 2);
		
		System.out.println((int)Math.sqrt(h) + " " + (int)Math.sqrt(w));

	}

}
