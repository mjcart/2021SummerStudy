package q2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2475 {

	public static void main(String[] args) throws IOException {
		int result = 0;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i : numbers) {
			result += Math.pow(i, 2);	//각 숫자 제곱의 합 구하기
		}
		result %= 10;	
		System.out.println(result);
		
	}

}
