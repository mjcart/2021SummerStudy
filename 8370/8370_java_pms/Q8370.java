package q8370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8370 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inp = bf.readLine();
		StringTokenizer st = new StringTokenizer(inp);
		int n1, n2, k1, k2;
		n1 = Integer.parseInt(st.nextToken());
		k1 = Integer.parseInt(st.nextToken());
		n2 = Integer.parseInt(st.nextToken());
		k2 = Integer.parseInt(st.nextToken());
		
		System.out.println(n1*k1 + n2*k2);

	}

}
