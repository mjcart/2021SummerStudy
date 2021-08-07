package q1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(char i : list) {
			System.out.print(i);
		}

	}

}
