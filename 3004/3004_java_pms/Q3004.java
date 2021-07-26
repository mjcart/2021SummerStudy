package q3004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3004 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result = 0;
		if(n%2==0) {
			result = (n/2+1)*(n/2+1);
		}else {
			result = (n/2+2)*(n/2+1);
		}
		System.out.println(result);
	}

}
