package q5522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q5522 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			numbers.add(Integer.parseInt(bf.readLine()));
		}
		
		int result = 0;
		for (int i : numbers) {
			result += i;
		}
		System.out.println(result);

	}

}
