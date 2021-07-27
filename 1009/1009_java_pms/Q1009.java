package q1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int result = 1;
			for(int j = 0; j < b; j++) {
				result = (result * a) % 10;	
			}
			if(result == 0) {
				System.out.println(10);
			}else {
				System.out.println(result);
			}
		}

	}

}
