package q5554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5554 {
	static int input = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 4; i++) {
			input += Integer.parseInt(bf.readLine());
		}
		
		System.out.println(input/60);
		System.out.println(input%60);
	}

}
