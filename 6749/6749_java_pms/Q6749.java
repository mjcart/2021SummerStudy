package q6749;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6749 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int third = Integer.parseInt(bf.readLine());
		int second = Integer.parseInt(bf.readLine());
		int rule = second - third;
		int first = second + rule;
		System.out.println(first);

	}

}
