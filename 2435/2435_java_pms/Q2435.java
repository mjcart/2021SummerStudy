package q2435;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2435 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringTokenizer num = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(num.nextToken());
		}
		
		int max = -2147483648;
		
		for(int i = 0; i <= n-k; i++) {
			int now = 0;
			for(int j = 0; j < k; j++) {
				now += arr[i+j];
			}
			if(now > max) {
				max = now;
			}
		}
		
		System.out.println(max);

	}

}
