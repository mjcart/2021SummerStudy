package q16394;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16394 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(bf.readLine());
		System.out.println(year - 1946);

	}

}
