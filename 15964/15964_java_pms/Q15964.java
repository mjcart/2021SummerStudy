package q15964;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15964 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long result = (a+b)*(a-b);
		System.out.println(result);

	}

}
